package testNGKeyWord;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InovacationCount {
  @Test(invocationCount = 3)
  public void MyMethod() 
  {
	  Reporter.log("mymethod is running", true);
  }
  @AfterMethod
  public void close()
  {
	  Reporter.log("method is close",true);
  }
}
