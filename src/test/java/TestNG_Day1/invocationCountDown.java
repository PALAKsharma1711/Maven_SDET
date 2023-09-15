package TestNG_Day1;
import org.testng.annotations.*;

//used to execute same test for multiple no of times

public class invocationCountDown 
{
	@Test(invocationCount= 2)
	void test()
	{
		System.out.println("Testing...");
	}

}
