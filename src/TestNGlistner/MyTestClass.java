package TestNGlistner;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;


@Listeners (TestNGlistner.Listner.class)

public class MyTestClass 
{
@Test
	public void myTest()
	{
		org.testng.Assert.fail();
	}
 @Test(dependsOnMethods = {"myTest"})
  public void myMethod() 
  {
	 // org.testng.Assert.fail();
	  Reporter.log("hii GM", true);
  }
}
