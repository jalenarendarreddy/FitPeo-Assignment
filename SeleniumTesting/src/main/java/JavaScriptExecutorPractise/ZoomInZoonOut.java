package JavaScriptExecutorPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZoomInZoonOut {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		//driver.manage().window().minimize();
		Thread.sleep(3000);		
	    driver.manage().window().maximize();
	    Thread.sleep(5000);	
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    	 
	    js.executeScript("document.body.style.zoom='50%'");  //set zoom level 50%
	    
	    Thread.sleep(5000);	
 	    
        js.executeScript("document.body.style.zoom='80%'");  //set zoom level 80%
	    
	    Thread.sleep(5000);	
	    
	    
	   
	}

}
