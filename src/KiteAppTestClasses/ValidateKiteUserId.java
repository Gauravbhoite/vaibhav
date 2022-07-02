package KiteAppTestClasses;

import java.io.IOException;import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClasses.BaseClasses;
import KiteAppPOM.KitePin_page;
import KiteAppPOM.Kite_HomePage;
import KiteAppPOM.Kite_Loginpage;
import KiteAppUtility.Utility;

public class ValidateKiteUserId extends BaseClasses 
{
	Kite_Loginpage login;
	KitePin_page pin;
	Kite_HomePage home;
    WebDriver driver;
    
	@BeforeClass
	public void launchBrowser()
	{
	openBrowser();
	login=new Kite_Loginpage(driver);
	pin=new KitePin_page(driver);
	home=new Kite_HomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(Utility.readDataFromXcel(0, 0));
		login.sendPassword(Utility.readDataFromXcel(0, 1));
		login.clickbutton();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
		pin.sendPin(Utility.readDataFromXcel(0, 2));
		pin.clickoncontinue();
	}
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  {
	 String actualusername = home.getactualuserid();
	  String expectedusername = Utility.readDataFromXcel(0, 0);
	  //use asserteEquals  
	  Assert.assertEquals(actualusername,expectedusername,"TC is fail actual and expected user name not matching");
	  Reporter.log("username are  matching TC is passed  ", true);
	  Utility.takescreenshot(driver);//for taking screenshot
  }
  @AfterMethod
  public void logoutFromKitApp() throws InterruptedException
  {
	  home.logout();
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
