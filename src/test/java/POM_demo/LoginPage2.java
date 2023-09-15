package POM_demo;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

//using Page Factory (Page Object class-login)

public class LoginPage2 
{
	WebDriver driver;
	
//Constructors
	
	LoginPage2(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);   //initializing the page factory methods
	}
		
//Locators
	
	@FindBy(xpath= "img[@alt='company-branding']")
	WebElement img_logo;	
//another way	
  //	@FindBy(how=How.XPATH,using="//img[@alt='company-branding']")
  //	WebElement img_logo;
	
	@FindBy(name= "usernmae")
	WebElement txt_username;
	
	@FindBy(name= "password")
	WebElement txt_password;
	
	@FindBy(xpath= "/button[@type='submit']")
	WebElement btn_submit;

//For locating multiple elements	
	
//	@FindBy(tagName="a")
//	List <WebElement>links;	
	
//Actions	
	
	public void setusername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		btn_submit.click();
	}
	
	public boolean checklogoPresence()
	{
		boolean status= img_logo.isDisplayed();
		return status;
	}

}
