package com.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);

		 //List<String> winIDs=new ArrayList<String>(windowIDs);

		// System.out.println( winIDs.get(0));
		// System.out.println( winIDs.get(1));
		// driver.switchTo().window(winIDs.get(1));
		//String title=driver.getTitle();
		//System.out.println(title);
		
		
		
		for(String winIDs:windowIDs) {
			
		   String title=driver.switchTo().window(winIDs).getTitle();
			
			if(title.equals("Human Resources Management Software | OrangeHRM")) {
				
				System.out.println(driver.getTitle());
                                break;
		
				
			}
			
	
	}
		
		
	}

}
