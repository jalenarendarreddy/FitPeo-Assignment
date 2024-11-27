package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		//using sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/06/2024");
		
		//using DatePicker
		
		String date="25";
		String month="July";
		String year="2025";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();   //opens date picker
		
	
	//select month and year
	while(true) {
		
		String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		System.out.println(currentMonth);
		System.out.println(currentYear);
		
		if(currentMonth.equals(month)  &&  currentYear.equals(year) ) {
			
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();   //clicking the next button
	
	}
	
	//selecting a date
	
    List<WebElement> allDates=	driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])//tr//td//a"));
    
    for(WebElement dt:allDates) {
    	
    	if(dt.getText().equals(date)) {
    		
    		dt.click();
    		break;
    		
    	}
    	
    }

	}

}
