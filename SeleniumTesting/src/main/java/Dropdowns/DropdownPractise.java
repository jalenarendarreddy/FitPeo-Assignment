package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractise {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Selenium']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Radio & Checkbox Demo']")).click();*/
		driver.findElement(By.xpath("//a[normalize-space()='Bank Project']")).click();
		
	    
	}

}
