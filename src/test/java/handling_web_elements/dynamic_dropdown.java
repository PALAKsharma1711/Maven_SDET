package handling_web_elements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
//implicit wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	Thread.sleep(3000);
	List<WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
//no of options
	System.out.println("Total no of elements are: " + options.size());
//printing the options on the console
	for(WebElement op:options)
		{
			System.out.println("The options are: " + op.getText());
		}	
//select an option from list
	for(int i=0;i<options.size();i++)
	{
		String text=options.get(i).getText();
		if(text.equals("selenium ide"))
		{
			options.get(i).click();
			break;
		}
	}	
	
	
	driver.close();
}}
