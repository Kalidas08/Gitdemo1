package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement section = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));

		System.out.println(section.findElements(By.tagName("a")).size());
		
		for (int i=1; i<section.findElements(By.tagName("a")).size();i++)
			
		{
			String clickkeys = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			section.findElements(By.tagName("a")).get(i).sendKeys(clickkeys);
			
		}
			
			Thread.sleep(5000);
			
			Set<String> abc = driver.getWindowHandles();
			
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())
				
			{
				
				driver.switchTo().window(it.next());
				
				System.out.println(driver.getTitle());
			}

	}

}
