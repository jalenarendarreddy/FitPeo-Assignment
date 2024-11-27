package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// driver.findElement(By.linkText("Forgotten password?")).click();
		// driver.findElement(By.cssSelector("input#email")).sendKeys("narendar@gmail.com");
		// driver.findElement(By.cssSelector("input[name='email']")).sendKeys("narendar1@gmail.com");
		// driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("nani");
		// driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("nani");
		//html/body/div/div/div/div/div/div/div/div/div/div/form/div/div/input
			
	   // driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("narendar5@gmail.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("narendar1@gmail.com");
	   driver.findElement(By.xpath("//*[text()='Create a Page']")).click();
		
	    
	}

}
