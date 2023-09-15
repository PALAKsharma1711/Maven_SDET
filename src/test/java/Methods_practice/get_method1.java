package Methods_practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class get_method1 
{
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeDriver driver=new ChromeDriver();
//use for maximize the browser window	
		driver.manage().window().maximize();  
//get method		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//get title	    
		System.out.println("The title of page is: " + driver.getTitle());	
//get Current URL: used to confirm whether we are on the correct page or not
		String url=driver.getCurrentUrl();
		System.out.println("The URL of page is: " + url);	
//get page source
		String ps=driver.getPageSource();
		
//		System.out.println("The HTML code is: " + ps);
//      show full HTML code (shortcut=right click & view page source or simply CTRL+U on the application)
		
	    System.out.println(ps.contains("html")); //true(if code is present) or false value
	    
	    System.out.println("code executed successfully");
	    driver.close();
		
}}
