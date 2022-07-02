package SoftAssart;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass 
{
		SoftAssert soft=new SoftAssert();
	
	
  @Test
  public void mymethod() 
  {
	  String a="pune";
	  String b="pune";
	  String c="mubmabi";
	  
	  soft.assertEquals(a,b,"TC is fail both are not equal");
	  
	  
	  soft.assertNotEquals(a,c,"TC is fail both are match");
	  soft.assertAll();
	  
  }
  
  @Test
  public void mymethod1()
  {
	  boolean a=true;
	  boolean b=false;
	  soft.assertTrue(b, "a is not true tC is fail");
	  soft.assertAll();
  }
  @Test
  public void mymethod2()
  {
	 String c="amravati";
	 String g=null;
	 
	 soft.assertNotNull(c,"TC is fail if value is not null");
	 soft.assertAll();
	 
  }
  @Test
  public void mymethod3()  //using HARD Assert
  {
	  String a="pune";
	  String b="pune";
	  String c="mubmabi";
	  
	  Assert.assertEquals(a, b,"TC is fail values are not match");
	  Reporter.log("values are match test case is pass", true);
  }
  
  
  
  
  


}
