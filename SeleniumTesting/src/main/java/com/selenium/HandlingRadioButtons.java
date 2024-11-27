package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		driver.manage().window().maximize();
	    WebElement ele=	driver.findElement(By.xpath("//input[@id='gender-male']"));
	    ele.click();
	    Thread.sleep(3000);
		
		if(ele.isSelected()) {
			
			System.out.println("radio button is selected");
            driver.findElement(By.xpath("//input[@id='gender-female']")).click();
			
			
		}
		
		
	}


}
