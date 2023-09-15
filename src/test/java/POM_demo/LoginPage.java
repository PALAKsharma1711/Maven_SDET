package POM_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//this class will not execute..its execution will be done in another class named LoginTest..which is the validation class of LoginPage class

//First approach..Without Using Page Factory

public class LoginPage 
{
	WebDriver driver;
	
//Constructor (it is required to automatically create the object)..required for initialization of web driver instance
	
	LoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
		
//Locators
	
	By img_logo_loc = By.xpath("img[@alt='company-branding']");
	By txt_username_loc = By.name("usernmae");
	By txt_password_loc = By.name("password");
	By btn_submit_loc = By.xpath("/button[@type='submit']");		
	
//Actions
	
	public void setusername(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(btn_submit_loc).click();
	}
	
	public boolean checklogoPresence()
	{
		boolean status= driver.findElement(img_logo_loc).isDisplayed();
		return status;
	}
	

}