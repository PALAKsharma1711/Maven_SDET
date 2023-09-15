package handling_web_elements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_with_inputBOX 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
//implicit wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

	Thread.sleep(5000);
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
//entering input	
	alert.sendKeys("Welcome");
//clicking OK
	alert.accept();

//validation for checking if code executed or not
	String actual=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
//Result expected
	String exp="You entered: Welcome";
	
	System.out.println("The actual value is: " + actual);
	System.out.println("The expected value is: " + exp);
	
	if(actual.equals(exp))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	
}}
