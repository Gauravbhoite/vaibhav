package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();//xpath by index method
		Thread.sleep(1000);
		
		WebElement otpbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(1000);
		
        boolean result = otpbutton.isEnabled();
		
		System.out.println("OTP button status is "+result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9503179798");
		Thread.sleep(1000);
		boolean result2 = otpbutton.isEnabled();
		System.out.println("after result is "+result2);
		
		
		//if(otpbutton.isEnabled())
		//{
			otpbutton.click();
		//}
		
		//else
		//{
		//	driver.findElement(By.id("mobilenNumber")).sendKeys("8888888888");
		//}
		//Thread.sleep(1000);
		//if(otpbutton.isEnabled())
		//{
		//	otpbutton.click();
		//}
		//else
		//{
		//	System.out.println("faile otp button");
		//}
		
		
		//boolean result = otpbutton.isEnabled();
		
		//System.out.println("OTP button status is "+result);

	}

}
