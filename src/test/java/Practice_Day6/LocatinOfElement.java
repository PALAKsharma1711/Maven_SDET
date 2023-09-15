package Practice_Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatinOfElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.manage().window().maximize();

//Before..Without Maximizing the window	
	
	WebElement logo= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
    System.out.println("The location of logo without maximize: " + logo.getLocation());
		
 //After..Without Maximizing the window	
    
    driver.manage().window().maximize();
    System.out.println("The location of logo after maximize: " + logo.getLocation());

Thread.sleep(5000);   
    driver.manage().window().minimize();
    System.out.println("The location of logo after minimize: " + logo.getLocation());
Thread.sleep(5000);    
    driver.manage().window().fullscreen();
    System.out.println("The location of logo after fullscreen: " + logo.getLocation());

 // changing window size..twice
	Point p= new Point(100,100);
	driver.manage().window().setPosition(p);
	System.out.println("The location of logo after setting window size: " + logo.getLocation());
Thread.sleep(5000);	
    p= new Point(50,50);
	driver.manage().window().setPosition(p);
	System.out.println("The location of logo after setting new window size: " + logo.getLocation());
	
	
	
	 System.out.println("code executed successfully");
		driver.close();
}}
