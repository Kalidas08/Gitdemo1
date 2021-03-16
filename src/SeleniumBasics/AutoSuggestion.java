package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("//input[@etitle='From']"));
		
		from.clear();
		
		from.sendKeys("Che");
		
		//from.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(5000);
		
		from.sendKeys(Keys.ENTER);
		
		WebElement to = driver.findElement(By.xpath("//input[@id='ToTag']"));
		
		to.sendKeys("Mum");
		
		Thread.sleep(5000);
		
		to.sendKeys(Keys.ENTER);
		
		
		
	}

}
