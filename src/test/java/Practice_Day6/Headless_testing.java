package Practice_Day6;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

//LOGIN page

public class Headless_testing 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{		
      //Approach 1 Headless Mode
		                 //firstly we will change chrome settings to convert it into headless mode
                         //headless mode means..we will only get direct result but will not be able to see the processing.
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless=new");
	
//		ChromeDriver driver=new ChromeDriver(options);
		
	  //Approach 2 Headless Mode
		
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--headless=new");
		
	    WebDriver driver= WebDriverManager.chromedriver().capabilities(options).create();
	
	driver.get("https://auth.geeksforgeeks.org/");
	
//1. Enter user name
	driver.findElement(By.id("luser")).sendKeys("ruchika@bebotechnologies.com");
	
//2. Enter password
	driver.findElement(By.name("pass")).sendKeys("test123");
	
//3. Click on login
	driver.findElement(By.className("signin-button")).click();
	
//4. Capture Title of home page
	String title = driver.getTitle();
	System.out.println(title);

//5. Verify the title of page	
	String act_title = driver.getTitle();
	String exp_title= "Login GeeksforGeeks";
	    //System.out.println(title);
	if(act_title.equals(exp_title))
		System.out.println("Test Passed");
	else
		System.out.println("Test Failed");
		 
//close browser
	driver.close();		
}}
