package ZeroDha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Kites {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
	      
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://kite.zerodha.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      File myfile=new File("D:\\velocity automation notes\\gaurav data selenium.xlsx");
	      Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet4");
	      String un = mysheet.getRow(0).getCell(0).getStringCellValue();
	      String psd = mysheet.getRow(0).getCell(1).getStringCellValue();
	      
	      String pin=mysheet.getRow(0).getCell(2).getStringCellValue();
	      
	      WebElement username = driver.findElement(By.id("userid"));
	      WebElement passward = driver.findElement(By.id("password"));
	      username.sendKeys(un);
	      passward.sendKeys(psd);
	      
	      WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	      login.click();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	      
	      WebElement id = driver.findElement(By.id("pin"));
	      WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	      id.sendKeys(pin);
	      submit.click();
	      
	      WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
	      String actualuserid = userid.getText();
	      String expecteduserid = un;
	      if(actualuserid.equals(expecteduserid))
	      {
	    	System.out.println("userid is matching test data is pass");  
	      }
	      else
	      {
	    	  System.out.println("userid is not match test data is fail");
	      }
	      userid.click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//a[@target='_self']")).click();
	      Thread.sleep(1000);
	      
	      driver.close();
	      
	      
	      

	}

}
