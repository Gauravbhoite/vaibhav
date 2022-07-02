package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass 
{
  @Test
  public void MyMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("my method is running");
  }
  @Test
  public void MyMethod1()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.facebook.com/login");
		Reporter.log("my method1 is running", true);
		
  }
  @Test
  public void MyMethod2()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Reporter.log("my method2 is running", true);
		
  }
  
}
