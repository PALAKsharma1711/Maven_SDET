package Practice_Day6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screenshot_specificElement 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();

//capture the particular element screenshot --- Selenium 4	
	
	TakesScreenshot ts=driver; 

	WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	File src= logo.getScreenshotAs(OutputType.FILE);
	File trg =new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Maven_SDET\\Screenshots\\logo.png");
	FileUtils.copyFile(src, trg);

}}
