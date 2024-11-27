package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractise {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
	    WebElement bank=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
	    
	    WebElement account=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
	    Actions act=new Actions(driver);
	    act.dragAndDrop(bank, account).perform();
	  
	    
	   
	}

}
