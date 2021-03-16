package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

		driver.findElement(By.id("datepicker")).click();

		// driver.findElement(By.cssSelector(".ui-datepicker-month")).getText().contains("September");

		while (!driver.findElement(By.cssSelector(".ui-datepicker-month")).getText().contains("September"))

		{

			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}

	// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

	int dates = driver.findElements(By.cssSelector(".ui-state-default")).size();

	for( int i = 1;i<dates;i++)
	{

		String dateclick = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();

		if (dateclick.equalsIgnoreCase("15"))

		{

			driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();

			break;

		}

	}

}

}