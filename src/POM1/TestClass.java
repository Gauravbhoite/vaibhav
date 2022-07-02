package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
	      
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://kite.zerodha.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      
	      Kite_Loginpage t1=new Kite_Loginpage(driver);
	      t1.username();
	      t1.password();
	      t1.clickbutton();
	      
	      Thread.sleep(1000);
	      KitePin_page kt=new KitePin_page (driver);
	      kt.pin1();
	      kt.clickoncontinue();
	      
	      Thread.sleep(1000);
	      Kite_HomePage home=new Kite_HomePage(driver);
	      home.validusername();
	      home.logout();
	      
	      Thread.sleep(1000);
	      driver.close();
	}

}
