package SeleniumBasics;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {

	public static void main(String[] args) {

		// Solution for popup displayed in the screen

		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		// 1-Allow, 2-Block, 0-default

		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.cleartrip.com/");

		driver.manage().window().maximize();

		Select adult = new Select(driver.findElement(By.name("adults")));

		adult.selectByIndex(3);

		Select child = new Select(driver.findElement(By.id("Childrens")));

		child.selectByVisibleText("4");

		driver.findElement(By.id("MoreOptionsLink")).click();

		Select classt = new Select(driver.findElement(By.id("Class")));

		classt.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name='airline']")).sendKeys("Indigo");

		driver.findElement(By.cssSelector("#DepartDate")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		// driver.switchTo().alert().dismiss();

	}

}
