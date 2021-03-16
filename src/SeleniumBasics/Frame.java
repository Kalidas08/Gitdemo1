package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Switch to frame

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

		// System.out.println(driver.findElement(By.id("draggable")).getText());

		Actions a = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();

		// Switch to normal window

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("input.ds-input")).sendKeys("Java");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("");
		

	}

}
