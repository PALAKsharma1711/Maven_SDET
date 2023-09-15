package TestNG_Day1;

import org.testng.annotations.*;

public class Annotations_demo2 
{
	@BeforeClass
	void login() 
	{
		System.out.println("This is login...");
	}
	
	@AfterClass
	void logout() 
	{
		System.out.println("This is logout...");
	}

	@Test(priority=1)
	void search() 
	{
		System.out.println("This is Search...");
	}
	
	@Test(priority=2)
	void advancedsearch() 
	{
		System.out.println("This is Advanced Search...");
	}

}
