package TestNG_Day1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.*;

public class Assertion_demo 

//in this if else does not work because the test will work even if condition is false..that time it will show "Test Failed"..  so we use assertion
{
	@Test
	void test()
	{
		int x=10;
		int y=15;
		
//		if(x==y)
//		{
//			System.out.println("Test Passed");
//		}
//		else
//		{
//			System.out.println("Test Failed");
//		}
		
//method 1
		
		//Assert.assertEquals(x,y);
		
//method 2
		
//		Assert.assertTrue(true); 
//		Assert.assertTrue(false);     //forcefully i am making method to pass or to be false
	
//method 3.. we can pass actual values as well
		
//		Assert.assertEquals("actual","expected","description");   syntax
		
//		Assert.assertEquals(x>y,true, "x is not greater than y");
		
		                    // x>y gives false and we have expected true..so test will fail 
		                    //description will print only if test fails

//assert allow all data types
		
		String s1= "abc";
		String s2= "abc";
		
//		Assert.assertEquals(s1,s2, "s1 is not equal to s2");   //pass
		
//		Assert.assertNotEquals(s1, s2);      //fail
		
		
//simple if else is not allowed but we can use it with assertions
		
		if(true)
		{
			Assert.assertTrue(true);
		}
		else	
			//Assert.assertTrue(false);    //this is dead code..because code will never reach here..because we are forcefully making test true
		    Assert.fail();
		
		
		
		
	}
}
