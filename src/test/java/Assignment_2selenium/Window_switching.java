package Assignment_2selenium;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Window_switching 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();

//open New WSindow
	WebElement link= driver.findElement(By.linkText("Click Here"));
//get Window Handles
	String currentWindowHandle= driver.getWindowHandle();
	Set<String> windowHandles= driver.getWindowHandles();
//switch to new window	
	for(String windowHandle:windowHandles)
	{
		if(!windowHandle.equals(currentWindowHandle))
		{
			driver.switchTo().window(windowHandle);
			break;
		}
	}
//perform actions in this window and switch back to original window
	driver.switchTo().window(currentWindowHandle);
//close browser
  	driver.close();	
}}
