package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook();
	    XSSFSheet sheet=workBook.createSheet("data");
	    XSSFRow row1=sheet.createRow(0);
	    row1.createCell(0).setCellValue("Java");
	    row1.createCell(1).setCellValue("10");
	    row1.createCell(2).setCellValue("Automation");
	    
	    XSSFRow row2=sheet.createRow(1);
	    row2.createCell(0).setCellValue("Python");
	    row2.createCell(1).setCellValue("15");
	    row2.createCell(2).setCellValue("Automation");
	    
	    XSSFRow row3=sheet.createRow(2);
	    row3.createCell(0).setCellValue("C#");
	    row3.createCell(1).setCellValue("20");
	    row3.createCell(2).setCellValue("Automation");
	    
	    workBook.write(file);
	    workBook.close();
	    file.close();
	    
	    System.out.println("File created sucessfully");
	    
	    
	    
		
		
	
		
	}

}
