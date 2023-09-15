package Mouse_handling;

import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_doubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	driver.manage().window().maximize();

	driver.switchTo().frame("iframeResult");
	WebElement f1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
	f1.clear();
	f1.sendKeys("Welcome");
	
	WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
	Actions act=new Actions(driver);
//perform double click on button	
	act.doubleClick(button).perform();
	
//validation
	WebElement f2=driver.findElement(By.xpath("//*[@id=\"field2\"]"));
	
//string copy text
//	String copiedtext=f2.getText("Value");  //inner text---not work in this case
	
	String copiedtext=f2.getAttribute("Value"); 
	
//	System.out.println("The text in the field2 is: " + copiedtext);
	
	if(copiedtext.equals("Welcome"))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed");
	}
	
	driver.close();
}}
