package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test_app2 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();		
//Open Web browser
		ChromeDriver driver=new ChromeDriver();
		
//open URL
		driver.get("https://demo.guru99.com/test/newtours/");
				
//1. Enter user name                                  //(right click and choose inspect option )
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
//2. Enter password
		driver.findElement(By.name("password")).sendKeys("mercury");
		
//3. Click on login
		driver.findElement(By.name("submit")).click();
				
//4. Capture Title 
		String title = driver.getTitle();
		System.out.println(title);

//5. Verify Title
		String act_title = driver.getTitle();
		String exp_title= "Login: Mercury Tours";  //<title>Login: Mercury Tours</title> (under head)
		    
		if(act_title.equals(exp_title))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");		

//close browser
		driver.close();				
}
}