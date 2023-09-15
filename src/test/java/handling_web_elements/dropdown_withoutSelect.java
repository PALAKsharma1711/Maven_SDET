package handling_web_elements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_withoutSelect 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
//implicit wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
	
	List <WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
			
//total no of elements
			System.out.println("Total no of elements are: "+ options.size());

//print all options on dropDown 
			Thread.sleep(5000);
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
//selecting single option from DropDown
//	for(int i=0;i<options.size();i++)
//	{
//		if(options.get(i).getText().equals("Java"))
//		{
//			options.get(i).click();
//			break;
//		}
//	}
	
//select multiple options from DropDown	
	Thread.sleep(5000);
	for(int i=0;i<options.size();i++)
	{
		String op=options.get(i).getText();
		if(op.equals("Java") || op.equals("Python") || op.equals("C#"))
		{
			options.get(i).click();   //we did not use break..so it will select all three options
		}
	}
	//for each
	//for(WebElement op:options)
	//{
	//	String Text= op.getText();
	//	if(Text.equals("Java") || Text.equals("Python") || Text.equals("C#"))
	//	{
	//		op.click();
	//	}
	//}
	
	driver.close();
	
}}
