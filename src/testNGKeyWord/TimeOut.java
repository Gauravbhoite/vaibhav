package testNGKeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut
{
	
		  @Test(timeOut = 1000)
		  public void D() throws InterruptedException 
		{
			  Thread.sleep(1200);//we using thread for method early execution 
			  Reporter.log("D is running", true);
		}
		  @Test(timeOut = 1200)
		  public void A() throws InterruptedException 
		  {
			  Thread.sleep(1000);
			  Reporter.log("A is running", true);
		}
		  @Test()
		  public void C() 
		{
			  Reporter.log("C is running", true);
		}
		  @Test()
		  public void B() 
		  {
			  Reporter.log("B is running", true);
		}
}
