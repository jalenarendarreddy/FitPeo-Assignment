package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excelfile -->Workbook-->Sheets-->Rows-->Cells
public class ReadingDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");     //	XSSFSheet sheet=workbook.getSheetAt(0);		
	    int totalRows=sheet.getLastRowNum();
	    int totalcells=sheet.getRow(1).getLastCellNum();
	    
	    System.out.println("number of rows:"+totalRows);
	    System.out.println("number of rows:"+totalcells);
	    
	    for(int r=0;r<=totalRows;r++) {
	    	
	    XSSFRow currentRow=	sheet.getRow(r);
	    
	    for(int c=0;c<totalcells;c++) {
	    	
	      XSSFCell cell=currentRow.getCell(c);
	      System.out.print(cell.toString()+"\t");
	    	
	    }
	    
	    System.out.println();
	    	
	    }
	    
	    workbook.close();
	    file.close();
		
	}

}
