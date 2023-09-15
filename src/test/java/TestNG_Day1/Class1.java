package TestNG_Day1;

import org.testng.annotations.*;

public class Class1 
{
	@Test()
	void abc() 
	{
		System.out.println("This is abc from class1");
	}
	
	@BeforeTest()
	void m() 
	{
		System.out.println("This is Before Test Method from class1");
	}

	@BeforeSuite()
	void m1() 
	{
		System.out.println("This is Before Suite method..");
	}
}
