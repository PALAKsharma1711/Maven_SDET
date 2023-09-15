package handling_web_elements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
//Alert is not a WEb Element..so we cannot inspect the elements 
public class handle_alert 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
//implicit wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	
//switching from driver to alert pop up window..alert is not web element
	Thread.sleep(5000);
	Alert alertwindow=driver.switchTo().alert();
//getting the text on alert window	
	System.out.println(alertwindow.getText());
//this will click on the OK button in alert window	
	alertwindow.accept();
//this will click on the Cancel button in alert window	
//		alertwindow.dismiss();
	

	
	
	
	
	
	
	
	
}}
