package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorDemo {

	public static void main(String[] arg)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kalid\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("test");

		driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("test1");

		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"))
				.sendKeys("abcd street");

		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");

		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("9994721391");

		driver.findElement(By.name("radiooptions")).click();

		String s = driver.findElement(By.cssSelector("label.checks")).getText();

		System.out.println(s);

		while (s.equalsIgnoreCase("Cricket"))

		{

			driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/div/input")).click();

			break;
		}

		Select sel = new Select(driver.findElement(By.cssSelector("select#Skills")));

		sel.selectByValue("Analytics");

	}

}
