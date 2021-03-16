package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeSite {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Workspace\\Executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'This is a link')]"));

		String clickkeys = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		link.sendKeys(clickkeys);
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		
		String parent = it.next();
		
		String child = it.next();
		
		driver.switchTo().window(parent);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.cssSelector("#fname")).sendKeys("Test");
		
		WebElement dropdown = driver.findElement(By.cssSelector("#testingDropdown"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Performance Testing");
		
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		
		driver.switchTo().alert().accept();
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("D:\\Selenium_Workspace\\PageImage.png"));
		
		driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
		
		driver.switchTo().alert().accept();
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#demo")));
		
		System.out.println(driver.findElement(By.cssSelector("#demo")).getText());
		
		WebElement source = driver.findElement(By.cssSelector("#sourceImage"));
		
		WebElement target = driver.findElement(By.id("targetDiv"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source, target).build().perform();
		
	}
}
