package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		int column = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th")).size();

		System.out.println(column);

		for (int i = 0; i < column; i++) {

			String columName = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th")).get(i).getText();

			System.out.println(columName);
		}

		int row = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();

		System.out.println(row);

		for (int j = 0; j < row - 8; j++)

		{

			String RowNames = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).get(j).getText();

			while (j == 2)

			{

				System.out.println(RowNames);

				break;

			}
		}

	}

}
