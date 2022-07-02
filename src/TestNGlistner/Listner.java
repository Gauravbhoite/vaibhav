package TestNGlistner;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
    //onestPAss
	//ontestFail
	//onTestsucess
	//onTestSkipp
	
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		Reporter.log("TC is fail screenshot is taken", true);
		ITestListener.super.onTestFailure(result);
		Reporter.log("failed TC name is "+result.getName(),true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is skiped,plz check dependent TC", true);
		ITestListener.super.onTestSuccess(result);
	}
}
