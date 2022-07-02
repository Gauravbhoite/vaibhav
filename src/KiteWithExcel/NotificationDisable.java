package KiteWithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationDisable {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
	      
	      ChromeOptions opt=new ChromeOptions();
	     // opt.addArguments("--disable-notification");
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://kite.zerodha.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      
    File myfile=new File("D:\\\\velocity automation notes\\\\gaurav data selenium.xlsx");
    
	 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet4");
	 
	int lastrowcount = mysheet.getLastRowNum();
	for(int i=0;i>=lastrowcount;i++)//using for loop
	{
	 String un = mysheet.getRow(i).getCell(0).getStringCellValue();
	 String pwd = mysheet.getRow(i).getCell(1).getStringCellValue(); 
	 String Kitepin = mysheet.getRow(i).getCell(2).getStringCellValue();
	      
	         
	         // for kite page 
	      Kite_Loginpage t1=new Kite_Loginpage(driver);
	     
	      t1.username(un);
	      t1.password(pwd);
	      t1.clickbutton();
	      
	      //pin page
	      Thread.sleep(1000);
	      KitePin_page kt=new KitePin_page (driver);
	      kt.pin1(Kitepin);
	      kt.clickoncontinue();
	      	
	      //home page
	      Thread.sleep(1000);
	      Kite_HomePage home=new Kite_HomePage(driver);
	     home.validusername(un);
	     home.logout();
	      Thread.sleep(1000);
	}
	      driver.close();
	}

}
