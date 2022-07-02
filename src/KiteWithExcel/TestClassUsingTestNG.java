package KiteWithExcel;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteWithExcel.Kite_HomePage;
import dev.failsafe.internal.util.Assert;

public class TestClassUsingTestNG {
Kite_HomePage home;
Kite_Loginpage login;
KitePin_page pin;
WebDriver driver;

Sheet mySheet; 
	
@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		 driver=new ChromeDriver();
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
public void logintoKiteApp()
{
	login.username(mySheet.getRow(0).getCell(0).getStringCellValue());
	login.password(mySheet.getRow(0).getCell(1).getStringCellValue());
	login.clickbutton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	pin.pin1(mySheet.getRow(0).getCell(2).getStringCellValue());
	pin.clickoncontinue();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

}
  @Test
  public void verifykiteUserName() 
  {
	//expected username-->excel
	  //actual username??
	 String actualuserid = home.getactualuserid();
	 String expecteduserid = mySheet.getRow(0).getCell(0).getStringCellValue();
	 
	
	  org.testng.Assert.assertEquals(actualuserid,expecteduserid,"UserID not matc TC fail" );
	Reporter.log("Expected and actual userid match TC pass",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	
  }
  @AfterMethod
  public void logoutFromkiteApp () throws InterruptedException
{   
   // home.validusername("");
	  home.logout();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

}
  @AfterClass 
  public void closeBrowser()
  {
	  //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.close();
	 

  }
  }
