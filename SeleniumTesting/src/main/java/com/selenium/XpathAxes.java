package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	      //String text=	driver.findElement(By.xpath("//a[normalize-space()='Jyothy Labs']/self::a")).getText();
		
	      //String text=	driver.findElement(By.xpath("//a[normalize-space()='Jyothy Labs']/parent::td")).getText();
		
	     // String text=	driver.findElement(By.xpath("//a[normalize-space()='Jyothy Labs']/ancestor::tr")).getText();
	      
	    List<WebElement> ele=  driver.findElements(By.xpath("//a[normalize-space()='HUDCO']/parent::td/following-sibling::td"));
	    
	    //System.out.println("size"+ele.size());
	    
	}

}
