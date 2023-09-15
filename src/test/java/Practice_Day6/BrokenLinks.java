package Practice_Day6;

import java.time.Duration;
import java.util.List;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks
{
    public static void main(String[] args) throws InterruptedException, IOException
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.deadlinkcity.com/");
	driver.manage().window().maximize();
	
//total no of links
	List<WebElement> links =driver.findElements(By.tagName("a"));
	System.out.println("Total no of links are: " + links.size());   //48
	
//initially we take broken links as zero..broken links is the variable name	
	int brokenlinks=0;  

	for(WebElement linkEle:links)
	{
		String hrefAttValue=linkEle.getAttribute("href");
		
		//first condition for checking the broken links
		
		if( hrefAttValue== null || hrefAttValue.isEmpty() )
		{
			System.out.println("href attribute is empty");
			continue;
		}
		
		//checking link is broken or not (status code)..we need to check the link by opening and then connecting it
		
		URL linkurl = new URL(hrefAttValue);   //converting string into URL format
		
		//Send the request to server ---- open and connect
		
		HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
		conn.connect();
		
		if(conn.getResponseCode() >= 400)
		{
			System.out.println(hrefAttValue + "   " + "=====> Broken Link");
			brokenlinks++;   //increment of no of broken link after every loop
		}
		
		else
		{
			System.out.println(hrefAttValue + "   " + "=====> Not Broken Link");
		}
	}
	
	System.out.println("Total no of Broken Links: " + brokenlinks);
	
	
}}
