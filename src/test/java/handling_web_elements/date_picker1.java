package handling_web_elements;

import java.time.Duration;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
//we need to use switch to frame..because this element is in  in frame	
	driver.switchTo().frame(0);
		
//Approach 1--- sendKeys
//	driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("08/17/2023");  // mm/dd/yy

//Approach 2
	
	String year="2024";
	String month="March";
	String date="22";
	
	driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click(); 
	
//selecting month and year first
//..we can not use for loop because we do not know the end point..so we will use while loop here
	while(true)
	{
	String m=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
	String y=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
	
	if(m.equals(month) && y.equals(year))
	{
		break;
	}
	 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
	}
	
//select date..future or current date
	
	List <WebElement> allDates= driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody"));
	
	for(WebElement dt:allDates)
	{
		if(dt.getText().equals(date))
		{
			dt.click();
			break;
		}
	}

	System.out.println("code executed successfully");
	driver.close();
}}
