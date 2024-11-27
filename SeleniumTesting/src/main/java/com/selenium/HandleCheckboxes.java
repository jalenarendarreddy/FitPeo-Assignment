package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		//selecting one check box
		//driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		
		//selecting all checkboxes
	    List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@name='webform' and @type='checkbox']"));
	    
	  /*  for(int i=0;i<checkboxes.size();i++) {
	    	
	    	checkboxes.get(i).click();
	    	
	    } */
	    
	    //using enhanced for loop
	   /* for(WebElement checkbox:checkboxes) {
	    	
	    	checkbox.click();
	    	
	    } */
	    
	    //selecting first two checkboxes
	   /* for(int i=0;i<2;i++) {
	    	checkboxes.get(i).click();
	    	
	    } */
	    
	    //selecting last two checkboxes
	    
	   /* for(int i=1;i<checkboxes.size();i++) {
	    	
	    	checkboxes.get(i).click();
	    	
	    } */
	    
	    //unselect check boxes if they are selected
	    
	    for(int i=0;i<2;i++) {
	    	checkboxes.get(i).click();
	    	
	    }
	    
	    Thread.sleep(5000);
	    
	    for(int i=0;i<checkboxes.size();i++) {
	    	
	    	if(checkboxes.get(i).isSelected()) {
	    		checkboxes.get(i).click();
	    	}
	    	
	    }
	    
	    
	}

}
