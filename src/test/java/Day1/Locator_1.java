package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 
{
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeDriver driver=new ChromeDriver();		
//it is important to maximize the screen of the site to be tested
//Used to maximize the screen
		driver.manage().window().maximize();   
//Open URL	
		driver.get("http://www.automationpractice.pl/index.php");
//Using locator id		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
//Using locator name		
		driver.findElement(By.name("submit_search")).click();
//Using locator linkText		
		//driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
//Using locator partialLinkText		
		driver.findElement(By.partialLinkText("Faded Short")).click();
//wait for 3 seconds		
		Thread.sleep(3000);
//show that your code is executed successfully		
		System.out.println("code executed successfully");
//close the browser		
		driver.close();
}}
