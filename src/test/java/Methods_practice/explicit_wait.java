package Methods_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();	

		//Declare & Usage
		
//Declare
		
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
//Usage
		
//works on condition and time
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("admin123");
		
		System.out.println("code executed successfully");
		driver.close();		
}}
