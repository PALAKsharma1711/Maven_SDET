package Frames;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_InnerFrames 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();

//switch to frame 1 using web element method
	WebElement frm1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().frame(frm1);
	driver.findElement(By.name("mytext1")).sendKeys("1111");
	
//switch to web page and then frame 3
	driver.switchTo().defaultContent();
	WebElement frm3=driver.findElement(By.xpath("/html/body"));
	driver.switchTo().frame(frm3);
	driver.findElement(By.name("mytext3")).sendKeys("3333");

//now in frame 3, there are no of inside frames..so we need not to switch to web page
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();

	//do on your your own
//frame2
//frame4
//frame5	
}}
