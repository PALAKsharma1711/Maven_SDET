package Mouse_handling;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class slider 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	driver.manage().window().maximize();
	
	Actions act= new Actions(driver);
	
//Minimum slider
	
	WebElement min_slider= driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
    System.out.println("Before moving the slider, the location is: " + min_slider.getLocation());
 //we are now moving the minimum slider in horizontal direction..so only x axis value will change 
    act.dragAndDropBy(min_slider, 100, 250).perform();
    System.out.println("After moving the slider, the location is: " + min_slider.getLocation());
	
	
//Maximum Slider	
	
 //   WebElement max_slider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover ui-state-focus']"));
 //   System.out.println("Before moving the slider, the location is: " + max_slider.getLocation());
 //we are now moving the max slider in horizontal direction..so only x axis value will change 
 //   act.dragAndDropBy(max_slider, 100, 250).perform();
 //   System.out.println("After moving the slider, the location is: " + max_slider.getLocation());
	
	
	
	 System.out.println("code executed successfully");
	driver.close();
}}
