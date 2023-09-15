package handling_web_elements;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker2 
{
		public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	driver.manage().window().maximize();	

	
	
	
}}
