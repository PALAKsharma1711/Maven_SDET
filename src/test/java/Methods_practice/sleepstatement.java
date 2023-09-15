package Methods_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sleepstatement 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);  //thread sleep statement
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(2000);  //thread sleep statement
		driver.findElement(By.name("password")).sendKeys("admin123");		
	
		System.out.println("code executed successfully");
		driver.close();
}}
