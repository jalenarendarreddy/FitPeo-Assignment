package KeyBoardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabsAndWindows {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		//selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB); //opens in a new tab
		driver.switchTo().newWindow(WindowType.WINDOW); //opens in a new window
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    
	
	  
	    

	}
	
	

}
