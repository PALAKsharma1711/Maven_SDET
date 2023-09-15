package Practice_Day6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screenshot_fullPage 
{
	 public static void main(String[] args) throws InterruptedException, IOException
		{
//		WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

//capture the full page screenshot --- Selenium 3 & 4	
		
//		TakesScreenshot ts=(TakesScreenshot)driver;  //type casting
		TakesScreenshot ts=driver; 
		
//saving screenshot in file format		
		File src= ts.getScreenshotAs(OutputType.FILE);
//created folder in Maven Dependencies for screenshots and then got the path from that folder
//right click on project and create folder and then right click on that new folder created and then properties and then copy location and paste here		
		File trg =new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Maven_SDET\\Screenshots\\fullpage.png");
//copy file from src to trg		
		FileUtils.copyFile(src, trg);
			
		
}}
