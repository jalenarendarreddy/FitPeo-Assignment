package com.selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtesionsAtRuntime {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		File file=new File("D:\\CRX files\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		System.out.println("title :"+title);
	}

}
