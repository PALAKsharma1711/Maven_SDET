package TestNG_Day1;

import org.testng.annotations.*;

public class Annotations_demo 
{
	@BeforeMethod
	void login() 
	{
		System.out.println("This is login...");
	}
	
	@Test(priority=1)
	void search() 
	{
		System.out.println("This is Search...");
	}
	
	@Test(priority=2)
	void Advancedsearch() 
	{
		System.out.println("This is advanced Search...");
	}
	
	@AfterMethod
	void logout() 
	{
		System.out.println("This is logout...");
	}

}
