package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frames 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.manage().window().maximize();

//switch from web page to frame 1	
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.linkText("org.openqa.selenium")).click();

//we cannot switch from one frame to another directly
//move back to web page and then to frame 2	
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("ContextAware")).click();
	
//move back to web page to frame 3
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[2]")).click();
	
	
	
	
	
	
	
}}
