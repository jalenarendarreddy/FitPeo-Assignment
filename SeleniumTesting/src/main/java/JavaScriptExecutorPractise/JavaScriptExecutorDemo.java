package JavaScriptExecutorPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutorDemo {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		driver.manage().window().maximize();
		
        WebElement inputbox=driver.findElement(By.xpath("//input[@id='FirstName']"));
        
        //passing the text into input box - alternative of sendkeys
        JavascriptExecutor js=(JavascriptExecutor) driver;
        
       // js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
       
        //clicking on element - alternative of click()
      WebElement radiobutton=  driver.findElement(By.xpath("//input[@id='gender-male']"));
      
      js.executeScript("arguments[0].click()", radiobutton);
      
        
        
        
      
	}
	
	

}
