package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[2]/div[1]/h4/a")).click();
//Printing the name on console		
		String product_name=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1")).getText();
		
		System.out.println(product_name);
		driver.close();

}}
