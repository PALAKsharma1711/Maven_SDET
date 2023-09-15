package Methods_practice;

import java.util.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Fluent_wait 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();

//for its presence once every 5 seconds
        //Declare
		
		FluentWait myWait=new FluentWait(driver);
				myWait.withTimeout(Duration.ofSeconds(30));
				myWait.pollingEvery(Duration.ofSeconds(5));
				myWait.ignoring(NoSuchElementException.class);
		
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
		
//usage
		WebElement username=(WebElement)myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));	
		username.sendKeys("Admin");
		
		WebElement password=(WebElement)myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));	
		password.sendKeys("admin123");
				
		System.out.println("code executed successfully");
		driver.close();	
}}
