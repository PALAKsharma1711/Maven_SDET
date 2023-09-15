package Interaction_with_elementsUsing_JS;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

//scroll bar is not the web element so we cannot inspect it..so we use java execute script

public class scrolling_page 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	driver.manage().window().maximize();

	JavascriptExecutor js=driver;
	
               //1. Scroll page down by some pixel
	
//	js.executeScript("window.scrollBy(0,3000)", "");
//	System.out.println(js.executeScript("return window.pageYOffset;", ""));  //Y offset refer to vertical movement of y axis of scroll bar
	                                                                         //to display by how much pixel..scroll bar has moved
//	Thread.sleep(5000);
	
	           //2. scroll down the page till flag of INDIA (any particular scenario)
	
//	WebElement India= driver.findElement(By.xpath("//img[@alt='Flag of India']"));
//	js.executeScript("arguments[0].scrollIntoView();", India);
//	System.out.println(js.executeScript("return window.pageYOffset;", "")); 
	
//	Thread.sleep(5000);
	
	           //3. scroll down till end of the document
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	System.out.println(js.executeScript("return window.pageYOffset;", ""));
	
	Thread.sleep(5000);
	
	           //4. scroll back to the initial position
	
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
	System.out.println(js.executeScript("return window.pageYOffset;", ""));
	
	Thread.sleep(5000);
	
	System.out.println("code executed successfully");	
}}
