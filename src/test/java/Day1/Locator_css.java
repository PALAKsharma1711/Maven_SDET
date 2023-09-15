package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_css 
{
	public static void main(String[] args)
	{		
		ChromeDriver driver=new ChromeDriver();	
//Maximize screen		
		driver.manage().window().maximize();
//open URL		
		driver.get("https://demo.nopcommerce.com/");
//1. Using tag and id #		
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");  //without tag name
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");		
//		driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
//2. Using tag and class .
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
//		driver.findElement(By.className("button-1")).click();
//3. Using tag and attribute []
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).click();
//		driver.findElement(By.className("button-1")).click();
//4 Using tag, class and attribute []
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
		driver.findElement(By.className("button-1")).click();
		
		System.out.println("code executed successfully");
		driver.close();

}}
