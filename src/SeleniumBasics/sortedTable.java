package SeleniumBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sortedTable {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Workspace\\Executables\\New folder\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				driver.findElement(By.xpath("//a[@href='#/offers']")).click();

				// Switching to Child windows
				Set<String> windows = driver.getWindowHandles();
				Iterator<String> it = windows.iterator();
				String parentWindow = it.next();
				String secondWindow = it.next();
				driver.switchTo().window(secondWindow);
				
				//Sorting
				List<WebElement> col = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
				
				ArrayList<String> originalList = new ArrayList<String>();
				for(int i=0; i<col.size();i++)
				{
					originalList.add(col.get(i).getText());
				}
				System.out.println("Original List is: "+ originalList);
				
				ArrayList<String> copiedList = new ArrayList<String>();
				for(int i=0; i<col.size();i++)
				{
					copiedList.add(originalList.get(i));
				}
				System.out.println("Copied List is: "+ copiedList);
				
				Collections.sort(copiedList);
				
				System.out.println("Sorted List is: ");
				
				for(String s:copiedList) 
				{
					System.out.println(s); 
					

				}
				
				Assert.assertTrue(originalList.equals(copiedList));
				
			}

		}

