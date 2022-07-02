package XmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest5 
{
  
	@Test(groups = "sanity")
	  public void tc6()
	  {
		  Reporter.log("sanity is running", true);
	  }
	  @Test(groups = "regression")
	  public void tc7()
	  {
		  Reporter.log("regression is running", true);
	  }
	  @Test(groups = "sanity")
	  public void tc8()
	  {
		  Reporter.log("sanity is running", true);
	  }
	  @Test(groups = "regression")
	  public void tc9()
	  {
		  Reporter.log("regression is running", true);
	  }
	  @Test(groups = "sanity")
	  public void tc10()
	  {
		  Reporter.log("sanity is running", true);
	  }
}
