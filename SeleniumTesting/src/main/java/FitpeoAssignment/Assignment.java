package FitpeoAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium chrome browser jars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]")).click();
		WebElement slider = driver.findElement(By.xpath(
				"//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']"));
         Thread.sleep(1000);
		// 2.scroll the page till element is visible

		WebElement ele = driver.findElement(By.xpath("//h4[normalize-space()='Medicare Eligible Patients']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);

		// Use Actions to drag the slider
		/*
		 * Actions actions = new Actions(driver);
		 * actions.clickAndHold(slider).moveByOffset(93, 0).release().perform(); // Move
		 * 50 pixels to the right Thread.sleep(1000); // Wait for animation to complete
		 */
        Thread.sleep(1000);
		// Locate the input box for the slider value
		WebElement inputBox = driver.findElement(By.xpath("//input[@id=':r0:']"));

		// Use JavaScript to set the value directly
		js.executeScript("arguments[0].value = '560'; arguments[0].dispatchEvent(new Event('input'));", inputBox);

		// Verify the value
		String updatedValue = inputBox.getAttribute("value");
		System.out.println("Updated Value in Text Box: " + updatedValue);

		Thread.sleep(2000);

		// 2.scroll the page till element is visible

		WebElement ele1 = driver.findElement(By.xpath("//p[normalize-space()='CPT-99091']"));
		js.executeScript("arguments[0].scrollIntoView()", ele1);

		//clicking the checkboxes 
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-rfiegf']//div[1]//label[1]//span[1]//input[1]"))
				.click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("//div[3]//label[1]//span[1]//input[1]")).click();

	}

}
