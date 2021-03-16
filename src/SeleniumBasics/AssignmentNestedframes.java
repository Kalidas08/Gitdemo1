package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNestedframes {

	public static void main(String[] args) {
		// https://the-internet.herokuapp.com/nested_frames

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

	}

}
