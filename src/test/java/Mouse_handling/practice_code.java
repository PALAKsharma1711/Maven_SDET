package Mouse_handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class practice_code 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	Actions act= new Actions(driver);
// 1
	WebElement bank= driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
    WebElement account_d= driver.findElement(By.xpath("//ol[@id='bank']"));
    act.dragAndDrop(bank, account_d).perform();
// 2	
    WebElement five_thousand_d= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
    WebElement amount_d= driver.findElement(By.xpath("//ol[@id='amt7']"));
    act.dragAndDrop(five_thousand_d,amount_d).perform();
// 3
    WebElement sales= driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
    WebElement  account_c= driver.findElement(By.xpath("//ol[@id='loan']"));
    act.dragAndDrop(sales,  account_c).perform();
// 4
    WebElement five_thousand_c= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
    WebElement amount_c= driver.findElement(By.xpath("//ol[@id='amt8']"));
    act.dragAndDrop(five_thousand_c, amount_c).perform();
//capture Perfect
    String actual=driver.findElement(By.xpath("//a[normalize-space()='Perfect!']")).getText();
  	String exp= "Perfect!";
  	
    if(actual.equals(exp))
	{
		System.out.println("PERFECT");
	}
	else
	{
		System.out.println("Test Failed");
	}
}}
