package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerPractise {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();  //click on date of birth
	
	   WebElement ele=	driver.findElement(By.xpath("//select[@aria-label='Select month']"));  
		
		Select selectMonth=new Select(ele);
		selectMonth.selectByVisibleText("Jul");
		
     WebElement ele1=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		
		Select selectYear=new Select(ele1);
		selectYear.selectByVisibleText("1998");
		driver.findElement(By.xpath("//a[normalize-space()='22']")).click();  //select a date
	}

}
