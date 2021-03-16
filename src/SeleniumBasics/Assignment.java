	package SeleniumBasics;
	
	import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	
	import org.apache.commons.io.FileUtils;
	
	public class Assignment {
	
		public static void main(String[] args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
	
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
			
			Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	
			//Count of checkboxes
			
			int size = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
			
			System.out.println(size);
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src,new File("E:\\Selenium_Workspace\\Notes\\Screenshot.png"));
	
		}
	
	}
