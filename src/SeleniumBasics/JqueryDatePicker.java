package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDatePicker {

	public static void main(String[] args) {
		
		String selectDates = "05-June-2022";
		
	    String dateArr[] = selectDates.split("-");
		
		String date = dateArr[0];
		
		String month = dateArr[1];
		
		String year = dateArr[2];
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Workspace\\Executables\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		
		int dateSize = driver.findElements(By.cssSelector(".ui-state-default")).size();
		
		while (!driver.findElement(By.cssSelector(".ui-datepicker-year")).getText().contains(""+year+""))
			
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
			
		}
		
		while (!driver.findElement(By.cssSelector(".ui-datepicker-month")).getText().contains(""+month+""))
			
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
			
		}
		
		for (int i=1; i<dateSize; i++) {
			
			String dates = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			
			if(dates.equalsIgnoreCase(date))
				
			{
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
				
				break;
			

			}
			
		}

	}

}
