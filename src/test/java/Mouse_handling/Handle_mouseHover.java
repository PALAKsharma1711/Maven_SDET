package Mouse_handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_mouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();

	WebElement desktop= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions act=new Actions(driver);
	
//Mouse Hover
	
//creating actions then performing
//	act.moveToElement(desktop).moveToElement(mac).click().build().perform();
//directly performing
	act.moveToElement(desktop).moveToElement(mac).click().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("code executed successfully");
	driver.close();
}}
