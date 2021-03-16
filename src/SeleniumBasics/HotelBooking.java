package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelBooking {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Workspace\\Executables\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.booking.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement search = driver.findElement(By.id("ss"));

		search.sendKeys("Coimbatore");

		search.sendKeys(Keys.ARROW_DOWN);
		
		search.sendKeys(Keys.ENTER);

		//driver.findElement(By.xpath("//div[@class='sb-date-field b-datepicker']")).click();
	}

}
