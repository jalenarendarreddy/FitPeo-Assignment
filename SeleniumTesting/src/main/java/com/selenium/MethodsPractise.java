package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodsPractise {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///D:/html/course%20registration%20form.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		System.out.println(driver.getTitle());
		
	WebElement ele=	driver.findElement(By.name("firstName"));
	ele.sendKeys("Narendar");
	
	String formname=driver.findElement(By.className("form1")).getText();
	System.out.println(formname);
	
	driver.findElement(By.name("gender")).click();
	
	Select dropdown = new Select(driver.findElement(By.name("country")));  
    dropdown.selectByVisibleText("USA");  
    
	Point TG=driver.findElement(By.name("firstName")).getLocation();
    System.out.println(TG);
	
	    
	 
	    
	}


}
