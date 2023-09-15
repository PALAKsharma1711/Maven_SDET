package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

public class login_page 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup(); //not required in latest version 4.4
		
		//Open Web browser
		ChromeDriver driver=new ChromeDriver();
		
		//open URL
		driver.get("https://auth.geeksforgeeks.org/");
		
		//automating our browser means opening the browser for testing
		//then type User name: ruchika@bebotechnologies.com
		//then password: test123	
//now below capturing the elements one by one
		
//1. Enter user name
		driver.findElement(By.id("luser")).sendKeys("ruchika@bebotechnologies.com");
		
//2. Enter password
		driver.findElement(By.name("pass")).sendKeys("test123");
		
//3. Click on login
		driver.findElement(By.className("signin-button")).click();
		
//4. Capture Title of home page
		String title = driver.getTitle();
		System.out.println(title);

//5. Verify the title of page	
		String act_title = driver.getTitle();
		String exp_title= "Login GeeksforGeeks";
		    //System.out.println(title);
		if(act_title.equals(exp_title))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
			 
//close browser
		driver.close();	
	}
}
