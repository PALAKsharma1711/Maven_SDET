package POM_demo;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;

//page Object class--login
//this the validation class of LginPage class
public class LoginTest 
{
	WebDriver driver;
	LoginPage lp;   //lp is object of another class that is LoginPage
	
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
		lp= new LoginPage(driver);
		Assert.assertEquals(lp.checklogoPresence(), true);
	}

	@Test(priority=2)
	void testLogin()
	{
		lp.setusername("Admin");
		lp.setpassword("admin123");
		lp.clickSubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");   //get the title from application
	}

	@AfterClass
	void close()
	{
		driver.close();
	}


}
