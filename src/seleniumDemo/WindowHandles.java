package seleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/blog/");

		driver.findElement(By.cssSelector("span[class='tcb-button-texts'] span")).click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> it = window.iterator();

		String parent = it.next();

		String child = it.next();

		driver.switchTo().window(child);

		String s = driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).getText();

		System.out.println(s);

		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).getText().split("C")[1]
				.trim().split("s")[0].trim());

		driver.switchTo().window(parent);

	}

}
