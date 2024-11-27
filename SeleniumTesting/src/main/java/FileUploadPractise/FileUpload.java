package FileUploadPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	driver.manage().window().maximize();
	
	//single file upload
  /*  driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\sample.html");
    
    if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("sample.html")) {
    	
    	System.out.println("file is uploaded sucessfully");
    	
    }
    
    else {
    	
    	System.out.println("file upload filed");
    }     
    
    */
	
	//Multiple files upload
	
	String file1="D:\\sample.html";
	String file2="D:\\index.html";
	
	
	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	
	int noOfFilesUploaded= driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	
	//validation 1 -- number of files
	if(noOfFilesUploaded == 2) {
		
		System.out.println("All files are uploaded");
		
	}
	else {
		
		System.out.println("Files are not uploaded or incorrect files uploaded");
	}
	
	//validation 2 -- file names
	
	if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("sample.html")  
			&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("index.html")) {
		
		System.out.println("File names matching");
		
	}
	else{
		
		System.out.println("File names are not matching");
		
	}

	
	
		
	    
	    
	   
	}


}
