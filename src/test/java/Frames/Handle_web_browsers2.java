package Frames;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_web_browsers2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();

//open second web browser by clicking on link
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

//capture the window IDs
	Set<String> windowids= driver.getWindowHandles();   //By default window IDs are captured by set

       //Approach 2
//	for(String winid:windowids)
//	{
//		String text=driver.switchTo().window(winid).getTitle();
	
//		if(text.equals("Orange HRM") || text.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
//		{
//			driver.close();	
//		}	
//	}
	
//OR
//	for(String winid:windowids)
//	{
//		String text=driver.switchTo().window(winid).getTitle();
		
//		System.out.println(text);
//		driver.close();
//	}	

//OR
	for(String winid:windowids)
	{
		String text=driver.switchTo().window(winid).getTitle();
		
		if(text.equals("OrangeHRM"))
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
		}
		else if(text.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
		{
			driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]/a[1]")).click();
		}
	}
	
	driver.close(); //closes child window only	
}}
