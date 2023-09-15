package TestNG_Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo 
{
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver= new ChromeDriver();
	}
	
	@Test(dataProvider="dp")     //here dataProvider is simply the option..not annotation
	void testLogin(String email, String pwd)    //here we take two parameters to pass the value..this is parameterization
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title= "nopCommerce demo store";
		String act_title= driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

//now we create a test which is not executable but is only used to provide data to the parameters
	
	@DataProvider(name="dp", indices= {0})   //indices will send selected data from data provided below
	String[][] loginData()
	{
		
		String[][] data= { {"merry@gmail.com", "test123"},
				           {"ruchika@gmail.com", "test"},
				           {"john@gmail.com", "aaa"},
				           {"ajay@gmail.com", "test12"} };
		
		return data;	
	 }	
}
