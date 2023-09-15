package POM_demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//page Object class--login
//this the validation class of LginPage2 class

public class LoginTest2 
{
	WebDriver driver;
	LoginPage2 lp2;   //lp2 is object of another class that is LoginPage
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testLogo()
	{
		lp2= new LoginPage2(driver);
		Assert.assertEquals(lp2.checklogoPresence(), true);
	}

	@Test(priority=2)
	void testLogin()
	{
		lp2.setusername("Admin");
		lp2.setpassword("admin123");
		lp2.clickSubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");   //get the title from application
	}

	@AfterClass
	void close()
	{
		driver.close();
	}
}
