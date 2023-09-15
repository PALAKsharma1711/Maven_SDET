package Interaction_with_elementsUsing_JS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class webElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();		
//	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=driver; //for chrome driver..type casting is not required because reference of chrome driver is created
//	JavascriptExecutor js=(JavascriptExecutor) driver;    //this is type casting that is we are using two different objects from completely different classes..so for that we need to do type casting
	
	    //1. INPUT BOX
	
	WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));	
	js.executeScript("arguments[0].setAttribute('value', 'JOHN')", inputbox);	//when sendKeys operation fails..then we directly call the java script	
		
	    //2. RADIO BUTTON
	
	WebElement male_rd = driver.findElement(By.id("male"));
	js.executeScript("arguments[0].click();", male_rd);   //male_rd.click();
		
		//3. CHECK BOX
		
	WebElement check_box = driver.findElement(By.id("sunday"));
	js.executeScript("arguments[0].click();", check_box); 	
		

	System.out.println("code executed successfully");	
}}
