package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest 
{
	
	ChromeDriver driver;
	
  @Test(priority=22)
  void openapp()
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @Test(priority=25)
  void login()
  {
	 driver.findElement(By.name("username")).sendKeys("Admin"); 
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
  }
  
  @Test(priority=30)
  void close()
  {
	  driver.close();
  }
}
