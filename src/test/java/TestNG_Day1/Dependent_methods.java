package TestNG_Day1;

import org.testng.Assert;
import org.testng.annotations.*;

public class Dependent_methods 
{
	
	@Test(priority=1)
	void openurl()
	{
		Assert.assertTrue(true);
	}

	@Test(priority=2,dependsOnMethods="openurl")
	void login()
	{
		Assert.assertTrue(true);
	}

	@Test(priority=3, dependsOnMethods="login")   //this means search is completely dependent on login
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods={"login","search"})
	void advancedsearch()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=5,dependsOnMethods={"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}

	
}
