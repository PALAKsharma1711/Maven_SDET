package TestNG_Day1;

import org.testng.annotations.*;

public class All_Annotations 
{
	@AfterSuite()
	void as() 
	{
		System.out.println("This is After Suite..");
	}
	
	@BeforeSuite()
	void bs() 
	{
		System.out.println("This is Before Suite..");
	}

	@BeforeTest()
	void bt() 
	{
		System.out.println("This is Before Test..");
	}
	
	@AfterTest()
	void at() 
	{
		System.out.println("This is After Test..");
	}
	
	@BeforeClass
	void bc() 
	{
		System.out.println("This is Before Class...");
	}
	
	@AfterClass
	void ac() 
	{
		System.out.println("This is After Class...");
	}
	
	@BeforeMethod
	void login() 
	{
		System.out.println("Login...Before Method");
	}
	
	@Test(priority=1)
	void search() 
	{
		System.out.println("Search...test1");
	}
	
	@Test(priority=2)
	void advancedseach() 
	{
		System.out.println("Advanced Search...test2");
	}
	
	@AfterMethod
	void logout() 
	{
		System.out.println("Logout...After Method");
	}
	
	
}
