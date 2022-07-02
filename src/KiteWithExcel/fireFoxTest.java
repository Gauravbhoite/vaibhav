package KiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFoxTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\Gaurav\\geckodriver.exe\\");
      WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("https://kite.zerodha.com/");
	}

}
