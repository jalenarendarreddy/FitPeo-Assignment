package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractise {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://mypage.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value=' Go ']")).click();
		
	     Alert alert=driver.switchTo().alert();
	     System.out.println(alert.getText());
	     alert.accept();
		
	    
	
		
		
	    
	}
	
	

}
