package Methods_practice;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_cmnds 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{		
		ChromeDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
//string		
		driver.navigate().to("https://www.amazon.in/"); 
//URL class
//		URL url=new URL("https://www.amazon.in/");
//		driver.navigate().to(url);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.navigate().to("https://testautomationpractice.blogspot.com/");   
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("code executed successfully");
		driver.close();
}}
