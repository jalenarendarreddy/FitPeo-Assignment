package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		//switch to frame
	    WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(frame);
	    
	    //minslider
	    WebElement minSlider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	    System.out.println("default location of minslider: "+minSlider.getLocation()); //(0, 4)=>(x,y)
	    
	    Actions act=new Actions(driver);
	    act.dragAndDropBy(minSlider, 100, 4).perform();
	    System.out.println("location of minslider after moving: "+minSlider.getLocation());  //(101, 4) =>(x,y)
	    
	 
	}

}
