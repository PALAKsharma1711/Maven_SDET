package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

//BeforeClass and AfterClass annotation will execute but the console will not show their details..it will consider only that method..which have test annotation
public class Annotation_demo 
{
  @BeforeClass
  void Login() 
  {
	System.out.println("This this login");  
  }
  
  @Test(priority=2)
  void Search() 
  {
	System.out.println("This this search");  
  }
  
  @AfterClass
  void Logout() 
  {
	System.out.println("This this logout");  
  }
}
