package handling_web_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class dropdown_boxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
//implicit wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	driver.manage().window().maximize();
	
	WebElement drpdwn=driver.findElement(By.name("country"));
	   drpdwn.click();
//select class	   
	   Select dp=new Select(drpdwn);	   
//Selecting option from DropDown
	   
//1. Using text
//	   dp.selectByVisibleText("China");
	
//2. Using value
//	   dp.selectByValue("4");
	
//3. Using index
//	   dp.selectByIndex(3);
	
//Total no of options in DropDown
	   List <WebElement> options=dp.getOptions();
	   System.out.println("Total no of options are: " + options.size());

//Print options in the console window 
	   for(int i=0;i<options.size();i++)
		{
		   System.out.println(options.get(i).getText());
		}
	//for each loop
//	   for(WebElement op:options)
//	   {
//		   System.out.println();
//	   }
	
	
	
	   System.out.println("code executed successfully");
		driver.close();
}}
