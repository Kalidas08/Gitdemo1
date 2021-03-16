package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Localors {
	
	public static void main(String[] arg)
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
											
		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");

		driver.findElement(By.className("signin")).click();

		// driver.close();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");

		driver.findElement(By.linkText("Forgot Password?")).click();

		//driver.findElement(By.cssSelector("input#txtlogin")).sendKeys("test");
		
		driver.findElement(By.xpath("//div[@class='form-elements']/div[3]/input")).sendKeys("test");

		//driver.findElement(By.xpath("//input[contains(@class,'rfloatL')]")).click();
		
		driver.findElement(By.xpath("//div[@title='Next']/div/following-sibling::input[2]")).click();

	}

}
