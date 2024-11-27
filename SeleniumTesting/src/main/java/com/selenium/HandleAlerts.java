package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal alert with ok button
	/*	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); */
		
		//confirmation alert - ok & cancel
		
	/*	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
	   //driver.switchTo().alert().dismiss();  //close alert using cancel button
		driver.switchTo().alert().accept();  //close alert using ok button   */
		
		//prompt alert  --Input box
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
	   Alert alert=	driver.switchTo().alert();
	   alert.sendKeys("admin");
	   Thread.sleep(3000);
	   alert.accept();
	
		
		
	    
	}
	
	
	

}
