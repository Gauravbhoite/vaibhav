package XmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest4 
{
  
  @Test(groups = "sanity")
  public void tc1()
  {
	  Reporter.log("sanity is running", true);
  }
  @Test(groups = "regression")
  public void tc2()
  {
	  Reporter.log("regression is running", true);
  }
  @Test(groups = "sanity")
  public void tc3()
  {
	  Reporter.log("sanity is running", true);
  }
  @Test(groups = "regression")
  public void tc4()
  {
	  Reporter.log("regression is running", true);
  }
  @Test(groups = "sanity")
  public void tc5()
  {
	  Reporter.log("sanity is running", true);
  }
}
