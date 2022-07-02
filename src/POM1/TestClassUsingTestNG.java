package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteWithExcel.Kite_HomePage;

public class TestClassUsingTestNG {
Kite_HomePage home;
Kite_Loginpage login;
KitePin_page pin;
WebDriver driver;

	
@BeforeClass
	public void launchBrowser()
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		home=new Kite_HomePage(driver);
		
	}	
@BeforeMethod
public void logintoKiteApp()
{
	
}
  @Test
  public void verifykiteUserName() 
  {
	  
  }
  @AfterMethod
  public void logoutFromkiteApp ()
{
	  
}
  @AfterClass 
  public void closeBrowser()
  {
	  
  }
  }
