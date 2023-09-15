package Assignment_2selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page 
{
	public static void main(String[] args)
	{
//Open Browser		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
//Open URL
		driver.get("https://www.gmail.com/inbox");
		driver.manage().window().maximize();
//Enter user name
		driver.findElement(By.id("username")).sendKeys("palak12347@gmail.com");
//Enter password
		driver.findElement(By.id("password")).sendKeys("sharma12347");	
//Click on login
		driver.findElement(By.id("loginButton")).click();
//Verify the title of page	
		String act_URL = driver.getCurrentUrl();
		String exp_URL= "https://www.gmail.com/inbox";
		  if(act_URL.equals(exp_URL))
		  {  
			System.out.println("Login Succesful");
		  }
		  else
		  {  
			System.out.println("Login Failed");
		  }
//close browser
		driver.close();			
}}
