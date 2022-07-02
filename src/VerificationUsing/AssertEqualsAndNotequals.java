package VerificationUsing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotequals {
  @Test
  public void mymethod() 
  {
	  
	  String f="fight";
	  String a="for";
	  String d="dream";
	  String e="fight";
	  
	  Assert.assertEquals(f,e,"string is not matching");
	  Reporter.log("string is matching TC is pass", true);
	  
	  Assert.assertNotEquals(a, e,"string is matching tc fail");
	  Reporter.log("string is not matching TC is pass", true);
  }
}
