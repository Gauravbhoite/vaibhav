package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationStudy 
{
  @Test
  public void MyTest()
  {
	 Reporter.log("test method is running", true); 
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log(" login method is running ",true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("logout method is running", true);
  }
  @BeforeClass 
  public void lounchbrowser()
  {
	  Reporter.log("lounch browser classs is running", true);
  }
  @AfterClass
  public void closebrowser()
  {
	Reporter.log("close browser class is running", true);  
  }
}
