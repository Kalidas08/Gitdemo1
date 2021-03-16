package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Workspace\\Executables\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		
	WebElement target =	driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
	
	Actions a = new Actions(driver);
	
	a.dragAndDrop(source, target).build().perform();

	}

}
