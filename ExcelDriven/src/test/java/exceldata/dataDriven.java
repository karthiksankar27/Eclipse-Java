package exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Karthik\\Desktop\\demodata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);// we are creating the object for XSSFWorkbook class
		// we have to tell this workbook where our file is present
		//but this workbook accepts filInputstream as argument
		//so we have created FileInputStream object and passed the location of the file
		
		//now we need to go to the particular sheet
		int sheets = workbook.getNumberOfSheets();// here we are getting the number of sheets
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) // here we are getting the sheets names and checking with our required sheetname
			{
				XSSFSheet sheet = workbook.getSheetAt(i);// here we are getting the index of the required sheet and making that as "sheet" of type XSSFSheet
				
				// now identify the testcase column by scanning the entire firstrow
				// once column is identified then scan the entire testcase column to identify "Purchase" testcase
				// after identifying the "Purchase" testcase row , grab all the datas from that sheet
				
				Iterator<Row> rows= sheet.iterator();// iterator has the ability to iterate through each row of the excel
				Row firstrow = rows.next(); // this is first next...so this will help to get data from 1st row...
				
				//we have got the access to the row... now we have to access the cell...so creating iterator using row
				Iterator<Cell> ce = firstrow.iterator(); // we have created the iterator for cell of the firstrow
				
				int k=0;
				int column =0;
				while(ce.hasNext()) // we are checking whether it has next cell... this will just check it doesnt move
				{
					Cell value = ce.next(); // we are moving to the next cell and storing the cell in "value"
					if(value.getStringCellValue().equalsIgnoreCase("testcases")) //here we are getting the string present in the cell and comparing with our reqd one... till now we got the "testcase" column
					{
						column=k; // here we are getting the column where we get "testcases"
					}
					k++;// we are incrementing till we find the "testcases" column
					
				}
				
				//once the column number is identified then scan the entire "testcases" column to identify the "purchase" testcase row
				
				while(rows.hasNext()) // now we are in the "testcases" column and checking it has other rows..
			{
					Row r = rows.next();// here we are moving to the next row of the "testcases" column
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) // here we are getting the cell of the particular column and then checking with "Purchase"
					{
						// after identifying the "Purchase" testcase row , grab all the datas from that sheet
						Iterator<Cell> cv = r.cellIterator(); // here to grab all the datas we are performing the cell iterator
						
						while(cv.hasNext())
						{
							a.add(cv.next().getStringCellValue());// we are getting the datas
							
						}
					}
				}
			}
		}
		

	}

}
