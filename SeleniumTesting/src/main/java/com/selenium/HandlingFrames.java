package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
        //frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));  
		driver.switchTo().frame(frame1); //switch to frame1
		WebElement ele = driver.findElement(By.xpath("//input[@name='mytext1']"));

		ele.sendKeys("admin");
		
		driver.switchTo().defaultContent();  //switching to main page
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);  //switching to frame using webElement.
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("selenium");
		//switching to inner iframe - part of frame3
		driver.switchTo().frame(0);  //switching to frame using index.
		WebElement ele1=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		//ele.click();
		//clicking the radio button by using javascript executor
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		driver.switchTo().defaultContent();
		
	    
		
		
	}

}
