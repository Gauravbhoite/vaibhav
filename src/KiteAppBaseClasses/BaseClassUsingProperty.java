package KiteAppBaseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KiteAppUtility.UtilityUsingProperty;

public class BaseClassUsingProperty 
{
   //Browser setup
	// I want seperate a methodnfor browser callipng 
	protected WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
	  driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	driver.get(UtilityUsingProperty.readDataFromProperty("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
}
