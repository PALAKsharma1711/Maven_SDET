package Assignment_2selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownInteraction 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	driver.manage().window().maximize();

//Locate the DropDown Element
	WebElement drpdwn=driver.findElement(By.name("country"));
	   drpdwn.click();
	
//select class	   
	 Select dp=new Select(drpdwn);	
//Selecting option from DropDown Using Visible Text
     dp.selectByVisibleText("India");
//Print selected option to console
     String selectedOption= dp.getFirstSelectedOption().getText();
     System.out.println("The selected option is: " + selectedOption);
//close browser
   	 driver.close();	
}}
