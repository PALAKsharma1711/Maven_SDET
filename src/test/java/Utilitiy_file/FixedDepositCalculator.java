package Utilitiy_file;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FixedDepositCalculator 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	driver.manage().window().maximize();
	
	String file= System.getProperty("user.dir" + "\\TestData\\caldata.xlsx");
	
	int rows= Excel_util.getRowCount(file, "Sheet1");
	
	for(int i=1; i<=rows; i++)
	{
	
//read the data from excel
	
	String princ =Excel_util.getCellData(file, "Sheet1", i, 0);
	String rateofinterest =Excel_util.getCellData(file, "Sheet1", i, 1);
	String per1 =Excel_util.getCellData(file, "Sheet1", i, 2);
	String per2= Excel_util.getCellData(file, "Sheet1", i, 3);
	String fre= Excel_util.getCellData(file, "Sheet1", i, 4);
	String exp_mvalue= Excel_util.getCellData(file, "Sheet1", i, 5);	

	Thread.sleep(3000);
	
//pass the data to the application
	
	driver.findElement(By.id("principal")).sendKeys(princ);
	driver.findElement(By.id("interest")).sendKeys(rateofinterest);
	driver.findElement(By.id("tenure")).sendKeys(per1);
	Select perdrp= new Select(driver.findElement(By.id("tenurePeriod")));
	perdrp.selectByVisibleText(per2);
	
	Select fredrp =new Select(driver.findElement(By.id("frequency")));
	fredrp.selectByVisibleText(fre);
	
	//driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
	
 //clicking on calculate button
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement calculate_btn =driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
	js.executeScript("arguments[0].click();", calculate_btn);
	
//validation & update results in excel
	
	String act_mvalue= driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
//here the value is in double..so we cannot use equal method because it is for string values only	
	
	if(Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue))
	{
		System.out.println("Test Passed");
		Excel_util.setCellData(file, "Sheet1", i, 7, "Passed");
	}
	else
	{
		System.out.println("Test Failed");
		Excel_util.setCellData(file, "Sheet1", i, 7, "Failed" );
	}

	Thread.sleep(3000);
	
//clicking on clear button
	
	WebElement clear_btn =driver.findElement(By.xpath("//img[@class='PL5']"));
	js.executeScript("arguments[0].click();", clear_btn);
	
	}
		
	
}}
