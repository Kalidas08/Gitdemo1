package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsNew {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// driver.findElement(By.xpath("//a[@value='MAA']")).click();

		// Parent child relationship

		driver.findElement(By.xpath(" //div[@id='marketCityPair_1'] //a[@value='MAA']")).click();

		Thread.sleep(2000);

		// ctl00_mainContent_ddl_destinationStation1_CTXT

		// driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();

		driver.findElement(By.xpath("//div[@class='right1'] //a[@value='CJB']")).click();

	}

}
