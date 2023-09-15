package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_2 
{
	public static void main(String[] args)
	{		
		ChromeDriver driver=new ChromeDriver();	
//maximize the browser window
		driver.manage().window().maximize();  		
//Open URL	
		driver.get("http://www.automationpractice.pl/index.php");		
//find no of sliders on the web page.. homeslider-container is common for all sliders  
		List <WebElement> sliders =driver.findElements(By.className("homeslider-container"));
////no of elements in the list		
		System.out.println("The no of sliders are:" + sliders.size());
//find the no of images in the home page
		List <WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println("The no of images are:" + image.size());
//find no of links in the home page
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The no of links are:" + links.size());
//find no of text boxes	
		List <WebElement> textboxes=driver.findElements(By.tagName("input"));
		System.out.println("The no of text boxes are:" + textboxes.size());
		
//close the browser		
		driver.close();
}}
