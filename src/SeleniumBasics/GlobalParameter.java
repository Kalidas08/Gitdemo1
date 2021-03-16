package SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalParameter {

	public static void main(String[] args) throws IOException  {

		Properties prop = new Properties();
		
		//read data from a file
		
		FileInputStream fis = new FileInputStream("E:\\Selenium_Workspace\\SeleniumBasics\\src\\SeleniumBasics\\data.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "Firefox");
		
		//write data from a file
		
		FileOutputStream fos = new FileOutputStream("E:\\Selenium_Workspace\\SeleniumBasics\\src\\SeleniumBasics\\data.properties");
		
		prop.store(fos, null);
		
		prop.setProperty("browser", "Firefox");
		
		System.out.println(prop.getProperty("browser"));

	}

}
