package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.testandquiz.com/selenium/testing.html");

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.cssSelector("#fname"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		a.moveToElement(driver.findElement(By.cssSelector("#fname"))).doubleClick().build().perform();
		
		//a.moveToElement(driver.findElement(By.cssSelector("#fname"))).click().contextClick().build().perform();

	}

}
