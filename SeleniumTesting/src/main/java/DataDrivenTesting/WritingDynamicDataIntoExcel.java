package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook();
	    XSSFSheet sheet=workBook.createSheet("DynamicData");
	    
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter no of rows?");
	    int noOfRows= scanner.nextInt();
	    
	    System.out.println("Enter no of columns?");
	    int noOfColumns=scanner.nextInt();
	    
	    for(int r=0;r<=noOfRows;r++) {
	    	
	    XSSFRow currentRow=	sheet.createRow(r);
	    
	    for(int c=0;c<noOfColumns;c++) {
	    	
	    XSSFCell cell=currentRow.createCell(c);
	    cell.setCellValue(scanner.next());
	    	
	    }
	    
	    	
	    }
	    
	    workBook.write(file);
	    workBook.close();
	    file.close();
	    
	    System.out.println("File created sucessfully");
		
		
	}

}
