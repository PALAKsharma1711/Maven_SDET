package handling_web_elements;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithNoElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
//implicit wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	
//	https://the-internet.herokuapp.com/     ...this is original URL
//	https://admin:admin@the-internet.herokuapp.com/	  ...this includes username (admin) and password (admin)
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/	");
	driver.manage().window().maximize();
	
	String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
	
	if(text.contains("Congratulations"))
	{
		System.out.println("TestPassed");
	}
	else
	{
		System.out.println("TestFailed");
	}
	
}}
