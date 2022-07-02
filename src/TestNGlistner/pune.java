package TestNGlistner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class pune 
{
	
  @Test
  public void Shivajinagar() 
  {
	  //Assert.fail();
	  Reporter.log("Shivajinagar TC is running", true);
  }
  @Test
  public void swargate()
  {
	  Reporter.log("swargate TC is pass", true);
  }
}
