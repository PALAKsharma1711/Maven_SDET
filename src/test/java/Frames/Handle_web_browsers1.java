package Frames;

import java.time.Duration;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_web_browsers1 
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
	
//Approach 1.. By Indexes	
	List<String> windowList= new ArrayList(windowids); //converting set into list..because set do not support window get handles
    String parent=windowList.get(0);   //first web browser
    String child=windowList.get(1);   //second web browser
    
//printing window IDs	
	System.out.println(parent);
	System.out.println(child);
	
//switching to child window
	driver.switchTo().window(child);
	driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
	
//switching to parent window
	driver.switchTo().window(parent);
	driver.findElement(By.name("username")).sendKeys("Admin");	
		
}}