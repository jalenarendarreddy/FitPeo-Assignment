package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//drag and drop1
	   WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
	   WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
	   
	   act.dragAndDrop(rome, italy).perform();
	   
	 //drag and drop2
	   WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
	   WebElement us=driver.findElement(By.xpath("//div[@id='box103']"));
	   
	   act.dragAndDrop(washington, us).perform(); 
	   
	
	}

}
