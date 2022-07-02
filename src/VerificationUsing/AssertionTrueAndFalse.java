package VerificationUsing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionTrueAndFalse {
  @Test
  public void mymethod() 
  {
	  boolean a=true;
	  boolean b=false;
	  boolean c=true;
	  
//	 Assert.assertTrue(a,"a value is false tc is fail");
//	 Reporter.log("tc is running tc pass",true);
	 
	 Assert.assertFalse(b,"b value is true tc is failed"); 
	 Reporter.log("tc is running tc is pass",true);
  }
}
