package TestNG_Day1;
import org.testng.annotations.*;

/*
login by email= sanity, regression
login by Facebook= sanity
login by twitter= sanity

sign up by email= sanity,regression
sign up by facebook= regression
sign up by twitter= regression

payment in rupees= sanity,regression
payment in dollar= sanity
payment return by bank= regression
*/

public class Grouping 
{
	@Test(priority=1,groups= {"sanity", "regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("this is login by facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("this is login by twitter");
	}
	
	@Test(priority=4,groups= {"sanity", "regression"})
	void signUpEmail()
	{
		System.out.println("this is sign up by email");
	}
	
	@Test(priority=5,groups= {"regression"})
	void signUpFacebook()
	{
		System.out.println("this is sign up by facebook");
	}
	
	@Test(priority=6,groups= {"regression"})
	void signUpTwitter()
	{
		System.out.println("this is sign up by Email");
	}
	
	@Test(priority=7,groups= {"sanity", "regression"})
	void paymentInDollar()
	{
		System.out.println("this is payment in Dollar");
	}
	
	@Test(priority=8,groups= {"sanity"})
	void paymentInRupee()
	{
		System.out.println("this is payment in rupee");
	}
	
	@Test(priority=9,groups= {"regression"})
	void paymentReturnByBank()
	{
		System.out.println("this is payment return by bank");
	}
	}
