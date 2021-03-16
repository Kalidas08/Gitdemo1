package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownDemo {

	public static void main(String[] arg) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		WebElement options = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));

		Select s = new Select(options);

		s.selectByIndex(4);

		// ctl00_mainContent_DropDownListCurrency

		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select s1 = new Select(dropdown);

		s1.selectByValue("GBP");
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		
		{
		
			System.out.println("It's Disabled");
			
			Assert.assertTrue(true);
		}
		
		else 
			
		{
			Assert.assertFalse(false);
			
		}
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		

	}

}
