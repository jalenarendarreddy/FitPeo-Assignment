package JavaScriptExecutorPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		driver.manage().window().maximize();
		
        JavascriptExecutor js=(JavascriptExecutor) driver;
        
        // 1.scrolldown page by pixel number.
      /*  js.executeScript("window.scrollBy(0,1000)", "");
        
        System.out.println( js.executeScript("return window.pageYOffset;")); //1000   */
        
        //2.scroll the page till element is visible
        
    /*   WebElement ele= driver.findElement(By.xpath("//strong[normalize-space()='Your Password']"));
       
       js.executeScript("arguments[0].scrollIntoView()", ele);
       System.out.println(js.executeScript("return window.pageYOffset;")); //1123.199951171875   */
        
        //3.scroll page till end of the page.
        
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        Thread.sleep(5000);
        
        //scrolling up to initial position
        
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        
        
        
        

        
        
        
        
        
      
	}

}
