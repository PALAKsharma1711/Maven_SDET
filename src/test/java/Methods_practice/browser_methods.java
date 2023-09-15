package Methods_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_methods 
{
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		
		Thread.sleep(3000);
		
		driver.close(); //(closes single window that is of driver URL)
		//driver.quit(); //(closes all windows)
}}
