package Methods_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();	

//wait for element for 5 seconds and applicable on all the web elements..we need not to type again and again
//if element is loaded in 2 seconds, it will load immediately..it will not wait for another 3 seconds 
//if after 5 seconds..web element is not loaded..it will throw an exception		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		System.out.println("code executed successfully");
		driver.close();

}}
