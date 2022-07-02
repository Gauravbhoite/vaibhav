package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriveMethods {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe" );
	
	WebDriver driver=new ChromeDriver();
	
	//ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(500);
	
	
	//driver.close();
	
	driver.navigate().to("https://kite.zerodha.com/");
	String title = driver.getTitle();
	System.out.println("title is "+title);
	
	driver.navigate().back();
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
	
	
	System.out.println(driver.getTitle());
	
    String url = driver.getCurrentUrl();
 
    System.out.println("url is "+url);
    
    System.out.println(driver.getCurrentUrl());

 
	}

}
