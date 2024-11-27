package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  List<WebElement>  sugessions=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li//div[@role='option']"));  //capture all the suggessions
	
	System.out.println(sugessions.size());
	
	for(WebElement ele:sugessions) {
		System.out.println(ele.getText());
		
	}
	
	for(WebElement ele:sugessions) {
		
		if(ele.getText().equals("selenium")) {
			
			System.out.println("Welcome to if block");
			
			driver.findElement(By.xpath("//span[normalize-space()='selenium']")).click();
			
		}
	}
		
		
		
	    
	}


}
