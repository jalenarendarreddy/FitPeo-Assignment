package Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticTableAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement depcities = driver.findElement(By.xpath("//select[@name='fromPort']"));

		Select sel = new Select(depcities);

		sel.selectByVisibleText("Boston");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement descities = driver.findElement(By.xpath("//select[@name='toPort']"));

		Select sel1 = new Select(descities);

		sel1.selectByVisibleText("London");

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		int rows=5;
		int lowestprise;
		
		String[] s1=null;
		
		int e=0;
		
		for(int i=2;i<=rows;i++) {
			
		WebElement prices=	driver.findElement(By.xpath("//body[1]/div[2]//tr["+rows+"]//td[6]"));
		
	  String s=  prices.getText();
	  System.out.println("value:: "+s);	  
	  s1[e]=s;
	  e++;
	  
	  System.out.println(s1);
	    
	  
			
		}
		
		
	
		
	
	}

}
