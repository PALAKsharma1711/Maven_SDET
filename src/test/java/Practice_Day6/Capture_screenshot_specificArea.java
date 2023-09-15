package Practice_Day6;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import java.io.File;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screenshot_specificArea
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
//	WebDriver driver=new ChromeDriver();
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();

//capture the particular area screenshot --- Selenium 4	
	
//	TakesScreenshot ts=(TakesScreenshot)driver;  //type casting
	TakesScreenshot ts=driver; 

	WebElement featuredproducts =driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	File src= featuredproducts.getScreenshotAs(OutputType.FILE);
	File trg =new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Maven_SDET\\Screenshots\\featuredproduct.png");
	FileUtils.copyFile(src, trg);
	
	
	
	
	
	
	
	
	
}}
