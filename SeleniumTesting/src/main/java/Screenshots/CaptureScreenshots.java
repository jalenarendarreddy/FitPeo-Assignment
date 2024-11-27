package Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/gift-cards");
		driver.manage().window().maximize();
		
		//1.full page screenshot
	/*	TakesScreenshot ts=(TakesScreenshot) driver;
		
	    File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	    
	    File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
	    sourceFile.renameTo(targetFile);    */
		
		//2.capture screenshot of specific section
		
	/*   WebElement giftCards=driver.findElement(By.xpath("//div[@class='page category-page']"));
	   
	   File sourceFile=giftCards.getScreenshotAs(OutputType.FILE);
	    
	    File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\giftCards.png");
	    sourceFile.renameTo(targetFile);   */
	    
	  //3.capture screenshot of specific element
		
		   WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		   
		   File sourceFile=logo.getScreenshotAs(OutputType.FILE);
		    
		    File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		    sourceFile.renameTo(targetFile);
	    
	    
	   
	   
	   
	    
	}

}
