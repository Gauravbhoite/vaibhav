package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class kiteTestCrossBrowser 
{
	
	Kite_HomePage home;
	Kite_Loginpage login;
	KitePin_page pin;
	WebDriver driver;

	Sheet mySheet; 
	
	@Parameters("browser")
	
	@BeforeClass
		public void launchBrowser(String browser) throws EncryptedDocumentException, IOException
		{
		if(browser.equals("chrome"))
		{
	        System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Gaurav\\geckodriver.exe\\");
		     driver=new FirefoxDriver();
		}
			 driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			login=new Kite_Loginpage(driver);
			home=new Kite_HomePage(driver);
			pin=new KitePin_page(driver);
	 File myfile=new File("D:\\\\velocity automation notes\\\\gaurav data selenium.xlsx");
	 mySheet=WorkbookFactory.create(myfile).getSheet("sheet4");
		}

	@BeforeMethod
	public void logintoKiteApp() //throws EncryptedDocumentException, IOException
	{
		
//		File myfile=new File("D:\\\\velocity automation notes\\\\gaurav data selenium.xlsx");
//		 mySheet=WorkbookFactory.create(myfile).getSheet("sheet4");

		login.username(mySheet.getRow(0).getCell(0).getStringCellValue());
		login.password(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		pin.pin1(mySheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickoncontinue();
	}
	  @Test
	  public void verifykiteUserName() 
	  {
		//expected username-->excel
		  //actual username??
		  
 String actualuserid = home.getactualuserid();
String expectedUserId = mySheet.getRow(0).getCell(0).getStringCellValue();
 Assert.assertEquals(actualuserid,expectedUserId,"Expected and actual userid not match TC fail");
Reporter.log("Expected and actual userid match TC pass",true);
	  }
	  
	  @AfterMethod
	  public void logoutFromkiteApp() throws InterruptedException
	{
		  home.logout();
	}
	  @AfterClass 
	  public void closeBrowser()throws InterruptedException
	  {
		  driver.close();
	  }

}
