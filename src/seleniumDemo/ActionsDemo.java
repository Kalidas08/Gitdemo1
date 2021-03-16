package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] arg)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(
				"https://www.goindigo.in/aff.html?cid=Display|Affiliate|Icubes|91023_350310_2---1007810---Cj0KCQjwi7yCBhDJARIsAMWFScMRZzNeinhKGWGf2y5HMv15GsdKb4IbN9WhlNzj0tLbzqyvSd6qbzkaAowdEALw_wcB&gclid=Cj0KCQjwi7yCBhDJARIsAMWFScMRZzNeinhKGWGf2y5HMv15GsdKb4IbN9WhlNzj0tLbzqyvSd6qbzkaAowdEALw_wcB");

		// driver.findElement(By.cssSelector(".link-has-menu.non-rewardmember")).click();

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.cssSelector(".link-has-menu.non-rewardmember")));

		a.moveToElement(driver.findElement(By.cssSelector("#igHpSearch"))).click().keyDown(Keys.SHIFT).sendKeys("test")
				.doubleClick().build().perform();

		WebElement from = driver.findElement(By.name("or-src"));

		from.clear();

		from.sendKeys("Delhi");

		from.click();

		/*List<WebElement> options = driver.findElements(
				By.xpath("//div[contains(@class, 'autocomplete-result station-result clearfix airport-item')]"));

		for (WebElement option : options)

		{
			System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase("MAA")) {
				option.click();
				break;

			} }*/


	}

}
