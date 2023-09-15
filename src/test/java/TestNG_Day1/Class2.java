package TestNG_Day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
public class Class2 
{
	
	@Test()
	void xyz() 
	{
		System.out.println("This is xyz from class2");
	}
	
	@AfterTest()
	void n() 
	{
		System.out.println("This is After Test Method from class2");
	}

	@AfterSuite()
	void n1() 
	{
		System.out.println("This is After Suite method..");
	}


}
