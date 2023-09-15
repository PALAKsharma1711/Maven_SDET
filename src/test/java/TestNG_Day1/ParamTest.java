package TestNG_Day1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

//Parameterization only executes with the XML file
//Serial Execution..in this thread count is not required..by default its value is 1
//thread count is required in parallel execution..and best range for thread count is 5

public class ParamTest 
{
	
//Serial Execution by default..we can  change it into parallel in XML File
//we can only achieve parallel testing in TestNG only
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br, String appUrl) throws InterruptedException  //br passes the value to the browser here
	{
		if(br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		else 
		{
			driver= new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //we can pass URL in test NG XML file as value
		driver.get(appUrl);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	void testLogo()
	{
	   try
		{
		boolean status= driver.findElement(By.xpath("//img[@alt='company-branding'")).isDisplayed();
		//isDisplayed is used to check whether the element that we want to search is available or not
		Assert.assertEquals(status, true);
		}
	   catch(Exception e)
		{
			Assert.fail();
		}
	}  
	
	@Test(priority=1)
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM", "Titles are not matched..");
	}

	@AfterClass
	void closeApp()
	{ 
		driver.close();
	}
	
}
