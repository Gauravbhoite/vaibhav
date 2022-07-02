package XmlStudy;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.ah.A;

import dev.failsafe.internal.util.Assert;

public class MyTest 
{
  
  @Test
  public void method1()
  { 
	  
	  Reporter.log("mymethod1 is running", true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("mymethod2 is running", true);
  }
  @Test
  public void method3()
  { 
	  
	  
	  Reporter.log("mymethod3 is running", true);
  }
  @Test
  public void method4()
  {
	  Reporter.log("mymethod4 is running", true);
  }
  @Test
  public void method5()
  {
	  Reporter.log("mymethod5 is running", true);
  }
}
