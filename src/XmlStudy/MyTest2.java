package XmlStudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest2 
{
  
  @Test
  public void method6()
  {
	  Assert.fail();
	  Reporter.log("mymethod6 is running", true);
  }
  @Test
  public void method7()
  {
	  Reporter.log("mymethod7 is running", true);
  }
  @Test
  public void method8()
  { Assert.fail();
	  Reporter.log("mymethod8 is running", true);
  }
  @Test
  public void method9()
  {
	  Reporter.log("mymethod9 is running", true);
  }
  @Test
  public void method10()
  {
	  Reporter.log("mymethod10 is running", true);
  }
}
