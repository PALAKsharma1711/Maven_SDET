package Read_and_Write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_excel 
{
	//Excel File--> Workbook--> Sheets--> Rows---> Cells

		public static void main(String args[]) throws IOException 
		{
//Excel File	
			FileOutputStream file=new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myfile.xlsx");
			                                               //here creating file is not mandatory..it will automatically create in case of writing..here myfile is the new file that will be created

//Workbook		
			XSSFWorkbook workbook= new XSSFWorkbook();
			XSSFSheet sheet= workbook.createSheet();	
			
//Create Row, Cell and update data
			//Approach 1.. without loop..beneficial only if we have to limited no of rows and cells
			
//			XSSFRow row1= sheet.createRow(0);  //row is created

//			row1.createCell(0).setCellValue("Welcome");    //cell is created and given value
//			row1.createCell(1).setCellValue("1234"); 
//			row1.createCell(2).setCellValue("xyz");
			
//            XSSFRow row2= sheet.createRow(1);  //row is created
			
//			row2.createCell(0).setCellValue("Welcome JAVA");    //cell is created and given value
//			row2.createCell(1).setCellValue("5678"); 
//			row2.createCell(2).setCellValue("abc");
			
			//Approach 2..with loop..recommended approach
			
			Scanner sc=new Scanner(System.in);
			
			for(int r=0;r<=3;r++) 
			{
				XSSFRow Currentrow= sheet.createRow(r);
				
				for(int c=0;c<2;c++)
				{
//				Currentrow.createCell(c).setCellValue("Welcome");
					
					System.out.println("Enter the value  ");
					String value= sc.next();
					Currentrow.createCell(c).setCellValue(value);
				}
			}
			
			workbook.write(file);
			
			workbook.close();
			file.close();
			
			System.out.println("Writing is done");
					
}}
