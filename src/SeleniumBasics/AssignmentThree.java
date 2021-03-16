package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	
		WebElement option = driver.findElement(By.id("checkBoxOption2"));
		
		option.click();
		
		String checkboxoption = option.getText();
		
		System.out.println(checkboxoption);


	}

}
