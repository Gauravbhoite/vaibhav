package VerificationUsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Verification {
  @Test
  public void myTc() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//checkbox.click();
//		if(checkbox.isSelected())
//       { 
//    	   Reporter.log("test case running", true);
//       }
//		else
//		{
//			Reporter.log("test case fail", true);
//		}
		//use assertion
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected(),"check box is not selected");
		Reporter.log("test case is running", true);
  }
  
}
