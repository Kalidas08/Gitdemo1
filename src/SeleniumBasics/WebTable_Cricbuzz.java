package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable_Cricbuzz {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Workspace\\Executables\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.cricbuzz.com/");

		// driver.findElement(By.cssSelector(".text-white"));

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//div[@id='rankingDropDown']"))).build().perform();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		WebElement option = driver.findElement(By.xpath("//a[contains(text(),'ICC Rankings - Men')]"));

		option.sendKeys(Keys.ARROW_DOWN);

		option.click();

		WebElement table = driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-padding-left0"));

		int rowCount = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-font-14.cb-lst-itm.text-center"))
				.size();

		for (int i = 0; i < rowCount; i++) {
			
			String tableValue = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-font-14.cb-lst-itm.text-center div:nth-child(3)")).get(i).getText();
			
			System.out.println(tableValue);

		}

	}

}
