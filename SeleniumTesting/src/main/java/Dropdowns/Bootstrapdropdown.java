package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2#google_vignette");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all the options and findout the size
		
		List<WebElement> ele=driver.findElements(By.xpath("//ul//label"));
		
		System.out.println("Number of options : "+ele.size());
		
		//printing options from dropdown
	   /*for(WebElement e :ele) {
			System.out.println(e.getText());
		} */
		
		//select multiple options
		
		for(WebElement e :ele) {
			String options=e.getText();
			
			if(options.equals("Angular") || options.equals("Python") || options.equals("Oracle")) {
				
				e.click();
			}
		}
		
		
		
	    
	
		
		
	    
	}
	

}
