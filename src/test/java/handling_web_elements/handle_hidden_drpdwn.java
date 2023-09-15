package handling_web_elements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_hidden_drpdwn 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
//implicit wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();

	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
	
	driver.findElement(By.xpath("//div[6]/div/div[2]/div/div/div[1]")).click();

//choose blur option to remove blur and hence getting hidden dropDown
	
	List <WebElement> options= driver.findElements(By.xpath("//div[@role='listbox']span")); 
	
	for(WebElement op:options)
	{
		//System.out.println("The hidden options are: " + op.getText());
	
		if(op.getText().equals("HR Manager"))
		{
			op.click();
			break;
		}
	}	
}}
