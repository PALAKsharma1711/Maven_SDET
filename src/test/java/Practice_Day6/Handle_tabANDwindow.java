package Practice_Day6;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_tabANDwindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	
//open another tab
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	
//for opening in completely different window in same browser	
//	driver.switchTo().newWindow(WindowType.WINDOW);
	
	System.out.println("code executed successfully");
	driver.close();
}}
