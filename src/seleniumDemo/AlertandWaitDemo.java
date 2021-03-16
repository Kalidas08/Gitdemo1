package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertandWaitDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/samplesiteforselenium#Sample_Page");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("#fname")).sendKeys("Test");

		WebElement element = driver.findElement(By.cssSelector("#dblClkBtn"));

		Actions a = new Actions(driver);

		//a.doubleClick(element).build().perform();

		//driver.switchTo().alert().accept();

		Select s = new Select(driver.findElement(By.id("testingDropdown")));

		s.selectByVisibleText("Performance Testing");

		//driver.findElement(By.cssSelector("div[id='AlertBox'] button")).click();

		//driver.switchTo().alert().dismiss();

		WebDriverWait w = new WebDriverWait(driver, 10);

		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='ConfirmBox'] button")));

		//driver.findElement(By.cssSelector("div[id='ConfirmBox'] button")).click();

		//driver.switchTo().alert().accept();

		//String msg = driver.findElement(By.id("demo")).getText();

		//Assert.assertEquals(msg, "You pressed OK!");

		WebElement Source = driver.findElement(By.cssSelector("#sourceImage"));

		WebElement Target = driver.findElement(By.id("targetDiv"));

		a.dragAndDrop(Source, Target).build().perform();

	}

}
