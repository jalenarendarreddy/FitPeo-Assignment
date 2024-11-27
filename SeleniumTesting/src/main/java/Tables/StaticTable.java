package Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//find total no of rows in a table
	    int rows=driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tr")).size();
	    System.out.println("No of rows :: "+rows);
	    
	    //find total no of columns of columns in a table
	    int columns=driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//th")).size();
	    System.out.println("No of columns :: "+columns);
	    
	    //read data from specific row and specific column(3rd row and 1st column)
	    
	    String name=driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tr[3]//td[1]")).getText();
	    System.out.println(name);
	    
	    
	    //read data from all the rows and columns
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    for(int r=2;r<=rows;r++) {
	    	
	    	for(int c=1;c<=columns;c++) {
	    		
	    		String value=driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tr["+r+"]//td["+c+"]")).getText();
	    		
	    		System.out.print(value+"    ");
	    			
	    	}
	    	
	    	System.out.println();
	    }
	    
	
	    
	}


}
