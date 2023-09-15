package Read_and_Write;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Reading_excel 
{
	//Excel File--> Workbook--> Sheets--> Rows---> Cells

	public static void main(String args[]) throws IOException
	{
//Excel File	
		FileInputStream file=new FileInputStream(System.getProperty("user.dir") + "\\TestData\\data.xlsx");
		
//Workbook		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
//Rows and Columns
		int row= sheet.getLastRowNum();            //total no of rows
		int col= sheet.getRow(1).getLastCellNum();    //for column count..we need to first see the row only
		
		System.out.println("The no of rows are: " + row);    //5
		System.out.println("The no of col are: " + col);	  //4
		
		for(int r=0; r<=row; r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0; c<col; c++)
			{
				//XSSFCell cell= currentRow.getCell(c);
				//String value= cell.toString();
				String value = currentRow.getCell(c).toString();   //another way of shifting to next cell
				
				System.out.print(value + "    ");
			}
			System.out.println("  ");
		}
		
		workbook.close();
		file.close();		
		
	}	
}
