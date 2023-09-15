package Mouse_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Drag_Drop 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	
	Actions act= new Actions(driver);

// Rome to Italy
	WebElement rome= driver.findElement(By.xpath("//div[@id='box6']"));
    WebElement italy= driver.findElement(By.xpath("//div[@id='box106']"));
    
    act.dragAndDrop(rome, italy).perform();
	
//Madrid to Spain	
    WebElement madrid= driver.findElement(By.xpath("//div[@id='box7']"));
    WebElement spain= driver.findElement(By.xpath("//div[@id='box107']"));
    
    act.dragAndDrop(madrid, spain).perform();
	
	
    System.out.println("code executed successfully");
	driver.close();
	
}}
