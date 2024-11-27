package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		
		//select option from the dropdown
		Select mon=new Select(ele);
		mon.selectByVisibleText("July");
		//mon.selectByValue("2");
		//mon.selectByIndex(5);
		
		//capture the options from the dropdown
	    List<WebElement> options=mon.getOptions();
	    
	    System.out.println("size : "+options.size());
	    
	  /*  for(int i=0;i<options.size();i++) {
	    	
	    	System.out.println(options.get(i).getText());
	    	
	    } */
	    
	    for(WebElement opt: options) {
	    	
	    	System.out.println(opt.getText());
	    	
	    }
	 
		
		
		
		
		
		
	    
	}

}
