package Methods_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_methods 
{
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  		
		driver.get("https://demo.nopcommerce.com/register");
		
//isDisplayed	
		WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		System.out.println(logo.isDisplayed());  //return boolean value
//isDisplayed & isEnabled
		WebElement input_box=driver.findElement(By.name("q"));
		System.out.println("The element is displayed: " + input_box);
		System.out.println("The element is enabled: " + input_box);
//isSelected	
		System.out.println("Before Selection....");
		
		WebElement male_rd= driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female_rd= driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		
		System.out.println(male_rd.isSelected());   //false  (before selection)
		System.out.println(female_rd.isSelected());  //false (before selection)
		
		female_rd.click();
		
System.out.println("After Selection....");

         System.out.println(male_rd.isSelected());   //false  (after selection)
         System.out.println(female_rd.isSelected());  //true (true selection)
		
		driver.close();			
}}
