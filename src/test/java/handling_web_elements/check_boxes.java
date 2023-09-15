package handling_web_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_boxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();

//handle single check box	
	driver.findElement(By.xpath("//input[@id='sunday']")).click();
	
//how many total no of elements
	List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@class='form-check-input'][ @type='checkbox']"));
	System.out.println("The total no of checkboxes are: " + checkboxes.size());
	
//how to select all the check boxes
	for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();   //this method is for lists.. checkboxes[i] is wrong
	}
//we can for each loop as well
//  for(WebElent chkb:checkboxes)
//	{
//		chkb.click();
//	}
	
//select last two check-boxes (in this case, we are dealing with indexes so cannot use for each loop
	for(int i=5;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}
	
//select first two check-boxes 
	for(int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
	}	
	
//unchecked or clear the selected check boxes..first for loop will select and second will deselect	
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}

//first it will select first three and then deselect all.. so only last four will be selected		
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++)   //this can be performed by for each loop as well
		{
			if(checkboxes.get(i).isSelected())   //this will first check if element is selected or  not
			checkboxes.get(i).click();
		}
//for each loop for above (without not operator)	 		
		for(WebElement chkb:checkboxes)
		{
			if(chkb.isSelected())    //every element is selected or not, we want to clear all element..so only those will be deselected which are selected
			{
				chkb.click();
			}
		}
//for each loop for above (with not operator)		
		for(WebElement chkb:checkboxes)
		{
			if(!(chkb.isSelected()))    //every element is selected or not, we want to clear all element..so only those will be deselected which are selected
			{
				chkb.click();
			}
		}
	
	
	
//all the above functions can be performed one by one..so we need to comment others
	
	System.out.println("code executed successfully");
	driver.close();
}}
