package Keyboard_Handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://text-compare.com/#google_vignette");
	driver.manage().window().maximize();

Thread.sleep(5000);	
	driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Welcome to World");
	
	Actions act= new Actions(driver);
//to press the key..method is keyDown and for unpressing the same key..method is keyUp
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();  //ctrl + a  For selecting the typed material
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();  //ctrl + c  For copying the typed material
Thread.sleep(5000);		
//now moving to next box..we need to press TAB	
	
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();  //TAB
Thread.sleep(5000);		
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();  //ctrl + v  For pasting the typed material
	
	System.out.println("code executed successfully");
	driver.close();
	
}}
