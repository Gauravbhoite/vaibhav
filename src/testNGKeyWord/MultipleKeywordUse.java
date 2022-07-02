package testNGKeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywordUse 
{
@Test(priority = -3,timeOut = 1500,enabled = true,dependsOnMethods = {"C"},invocationCount =4 )
	  public void D() throws InterruptedException 
	{
		Thread.sleep(1000);
		  Reporter.log("D is running", true);
	}
	  @Test()
	  public void A() 
	  {
		  Reporter.log("A is running", true);
	}
	  @Test()
	  public void C() throws InterruptedException
	{
		  Reporter.log("C is running", true);
	}
	  @Test
	  public void B() 
	  {
		  Reporter.log("B is running", true);
	}
}
