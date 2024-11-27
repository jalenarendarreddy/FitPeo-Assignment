package KeyBoardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	    WebElement regLink= driver.findElement(By.xpath("//a[normalize-space()='Security Project']"));
	    
	    Actions act=new Actions(driver);
	    act.keyDown(Keys.CONTROL).click(regLink).keyDown(Keys.CONTROL).perform();
	    
	List<String> ids=  new ArrayList<String>(driver.getWindowHandles());
	
	driver.switchTo().window(ids.get(1));
	
	  
	    

	}
	
	

}
