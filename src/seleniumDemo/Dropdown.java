package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement dropdown = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));

		Select s = new Select(dropdown);

		s.selectByIndex(2);

		Thread.sleep(2000);

		System.out.println(s.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("div#divpaxinfo")).click();

		Thread.sleep(2000);

		int i = 1;

		while (i < 5)

		{
			driver.findElement(By.id("hrefIncAdt")).click();

			i++;

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.cssSelector("a[value='BLR']")).click();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// Another Way with parent and child xpath

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		// Auto suggestive dropdown

		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("Ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options)

		{
			if (option.getText().equalsIgnoreCase("India"))

			{
				option.click();

				break;
			}

		}

	}

}
