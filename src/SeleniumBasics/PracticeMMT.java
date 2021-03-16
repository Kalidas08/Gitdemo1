package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PracticeMMT {

	public static void main(String[] args) throws InterruptedException {
	
		
		FirefoxOptions option = new FirefoxOptions();
		
		option.addPreference("geo.enabled", false);

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Workspace\\Executables\\New folder\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver(option);

		driver.get("https://www.makemytrip.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();

		WebElement from = driver.findElement(By.cssSelector("input[placeholder='From']"));

		String keys = Keys.chord(Keys.ARROW_DOWN, Keys.ENTER);

		from.sendKeys("che");

		while (!driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/div/p")).getText().contains("Chennai, India"));

		{
			from.sendKeys(keys);

		}

		driver.findElement(By.xpath("//span[contains(text(),'To')]")).click();

		WebElement to = driver.findElement(By.cssSelector("input[placeholder='To']"));

		to.sendKeys("bangalore");

		while (!driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']/div[1]/div/p")).getText().contains("Bengaluru, India"));
		
		{

			to.sendKeys(keys);
		}
		
		driver.findElement(By.cssSelector(".fsw_inputBox.dates.inactiveWidget")).click();
		
		int dates= driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div[1]/p[1]")).size();
		
		for (int i=0; i<dates; i++)
		{
			String date = driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div[1]/p[1]")).get(i).getText();
			
			if (date.equalsIgnoreCase("18"))
				
			{
				driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div[1]/p[1]")).get(i).click();
				
				break;
				
			}
			
		}
		
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	
		
		driver.findElement(By.id("travellers")).click();
		
		driver.findElement(By.cssSelector(".guestCounter.font12.darkText ul:nth-child(3)")).click();
		
		driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight']")).click();

	}

}
