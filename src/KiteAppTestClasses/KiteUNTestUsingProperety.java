package KiteAppTestClasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClasses.BaseClassUsingProperty;
import KiteAppPOM.KitePin_page;
import KiteAppPOM.Kite_HomePage;
import KiteAppPOM.Kite_Loginpage;
import KiteAppUtility.UtilityUsingProperty;

public class KiteUNTestUsingProperety extends BaseClassUsingProperty //extend base class property
{
	Kite_Loginpage login;
	Kite_HomePage home;
	KitePin_page pin;
	
	@BeforeClass
	public void lounchBrowser() throws IOException
	{
		openBrowser();
		login=new Kite_Loginpage(driver);
	    home=new Kite_HomePage(driver);
		pin=new KitePin_page(driver);
	}
	@BeforeMethod 
	public void loginToKiteApp() throws IOException
	{
	login.sendUserName(UtilityUsingProperty.readDataFromProperty("UN"));
	pin.sendPin(UtilityUsingProperty.readDataFromProperty("PIN"));
		
	}
	
  @Test
  public void validUserName()
  {
	  
	  
  }
}
