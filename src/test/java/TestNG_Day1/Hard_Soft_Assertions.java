package TestNG_Day1;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Assertions 
{
//	@Test   here we commented test..so no method inside this will execute
	void hard()            //in hard assertion..if assertion fails..method also fails
	{
		System.out.println("Testing...");
		System.out.println("Testing...");
		System.out.println("Testing...");
		
//		Assert.assertEquals(1, 1);  //pass
		
		Assert.assertEquals(1, 2);  //fail
		
		System.out.println("Hard Assertion completed");
		Assert.assertEquals(1, 1);
	}
	
//now i want after the failure of first assertion.. my all other assertions must work.. this can be done with soft assertion
	
	@Test
	void soft_assertion()            
	{
		System.out.println("Testing...");
		System.out.println("Testing...");
		System.out.println("Testing...");
		
//		Assert.assertEquals(1, 1);  //pass
		
		SoftAssert sa=new SoftAssert();  
		sa.assertEquals(1, 2);              //fail
		
		System.out.println("Soft Assertion completed");
		Assert.assertEquals(1, 1);        //pass
		
		sa.assertAll();   //mandatory to make soft assertion to work properly
	}
		
}