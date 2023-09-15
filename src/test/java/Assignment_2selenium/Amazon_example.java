package Assignment_2selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;

public class Amazon_example 
{
	public static void main(String[] args) throws InterruptedException
	{
//Open Browser		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
//Open URL
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
//Locate element "Click Me"
		WebElement clickMe =driver.findElement(By.linkText("Click me"));
		clickMe.click();
//Wait for 5 seconds
		Thread.sleep(5000);
//Verify new page's URL
		String act_URL = driver.getCurrentUrl();
		String exp_URL= "https://www.amazon.in";
		  if(act_URL.equals(exp_URL))
		  {  
			System.out.println("New page URL verification succesful..");
		  }
		  else
		  {  
			System.out.println("New page URL verification Failed");
		  }
//close browser
		driver.close();	
}}
