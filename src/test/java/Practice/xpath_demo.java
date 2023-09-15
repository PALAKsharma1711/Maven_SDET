package Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_demo 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
//Self-	Selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'Union Bank of In')]")).getText();
		System.out.println("Self: "+ text); //Self: Union Bank of In
		
//Parent- Selects the parent of current node (always one)		
		text=driver.findElement(By.xpath("//a[contains(text(),'Union Bank of In')]/parent::td")).getText();
		System.out.println("Parent: "+ text); //Parent: Union Bank of In
		
//Child- Selects all children of the current node (one or many)		
		List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Union Bank of In')]/ancestor::tr/child::td"));
		System.out.println("No of Child elements: "+ childs.size()); //5
		
//Ancestor- Selects all ancestors (parent, grand-parent, etc.) 
		text=driver.findElement(By.xpath("//a[contains(text(),'Union Bank of In')]/ancestor::tr")).getText();
		System.out.println("Ancestor: "+ text); //Union Bank of In...
		
//Descendant- Selects all descendants (children, grand-children, etc.) of current node
		List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'Union Bank of In')]/ancestor::tr/descendant::*"));
		System.out.println("No of Descendant nodes: "+ descendants.size()); //7
		
//Following- Selects everything in the document after the closing tag of current node
		List<WebElement> followingnodes=driver.findElements(By.xpath("//a[contains(text(),'Union Bank of In')]/following::tr"));
		System.out.println("No of following nodes: "+ followingnodes.size()); 		
	
//Following sibling- Selects all siblings after the current node
		List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Union Bank of In')]/following::tr"));
		System.out.println("No of following siblings: "+ followingsiblings.size()); 
		
//Preceding- Selects all nodes that appear before the current node in the document
		List<WebElement> precedings=driver.findElements(By.xpath("//a[contains(text(),'Union Bank of In')]/following::tr"));
		System.out.println("No of preceding nodes: "+ precedings.size());
		
//Preceding sibling- Selects all the siblings before the current node		
		List<WebElement> precedingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Union Bank of In')]/following::tr"));
		System.out.println("No of preceding sibling nodes: "+ precedingsiblings.size());
		
		System.out.println("code executed successfully");
		driver.close();
	}
}
