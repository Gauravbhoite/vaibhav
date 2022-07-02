package testNGKeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse 
{
  @Test(priority = -3)
  public void D() 
{
	  Reporter.log("D is running", true);
}
  @Test(priority = -2)
  public void A() 
  {
	  Reporter.log("A is running", true);
}
  @Test(priority = -1)
  public void C() 
{
	  Reporter.log("C is running", true);
}
  @Test(priority = 0)
  public void B() 
  {
	  Reporter.log("B is running", true);
}
}
