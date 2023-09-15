package TestNG;

import org.testng.annotations.Test;

//here test executes randomly but we want it to perform login first..then search and then logout
//so we need to use the Priority method..so script will execute as per our requirement
//priority is option..not the annotation

public class FirstTest 
{
  @Test(priority=1)
  void Login() 
  {
	System.out.println("This this login");  
  }
  
  @Test(priority=2)
  void Search() 
  {
	System.out.println("This this Search");  
  }
  
  @Test(priority=3)
  void Logout() 
  {
	System.out.println("This this logout");  
  }
  
}
