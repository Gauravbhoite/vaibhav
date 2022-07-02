package KiteAppBaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClasses 
{
   //Browser setup
	// I want seperate a methodnfor browser callipng 
	protected WebDriver driver;
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
}
