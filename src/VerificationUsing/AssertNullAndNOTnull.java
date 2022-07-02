package VerificationUsing;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertNullAndNOTnull {
  @Test
  public void mymethod() 
  
  {
	  String a=null;
	  String b="Hii";
	  
	  Assert.notNull(b,"value is null tc fail");
	  Reporter.log("value is not null tc pass", false);
	  
	  //Assert.as
  }
}
