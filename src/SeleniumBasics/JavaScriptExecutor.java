package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium_Workspace\\\\Executables\\\\New folder\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//String script = "return document.getElementsByName(\"q\").value='Automation';";
	
	js.executeScript("document.getElementsByName(\"q\").value='Automation';");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src,new File("D://google.png"));
	
	}

}
