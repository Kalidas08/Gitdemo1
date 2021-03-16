package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/#/practice-project");
		
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//div[@class='row clearfix']/div/input")).sendKeys("Kalidas");

		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Kalidassganesan94@gmail.com");

		//driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/following-sibling::input[2]")).click();

		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Welcome");
		// driver.findElement(By.cssSelector("input[value='Google Search'")).click();
		// xpath
		// tagname[@attribute='value']
		// tagname[contains,'value]

		// driver.findElement(By.xpath("//input[contains(@autocomplete,'o')]")).sendKeys("welcome");

		// driver.findElement(By.cssSelector("input[name*='bt'")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'na')]")).sendKeys("Kalidas");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Kalidassganesan94@gmail.com");
		
		driver.findElement(By.xpath("//button[@id='form-submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='projects-item']/p/following-sibling::a[2]")).click();
		

	}

}
