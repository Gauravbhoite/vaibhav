package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKey_sytudy {

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(100);
	
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9503179798");//use send key
	
	WebElement emailid = driver.findElement(By.xpath("//input[@name='email']"));//create refrence variable of email id
	emailid.sendKeys("9503179798");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("96969696");//wrong password use
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='pass']")).clear();
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("969696");//correct pass use
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
	
	
	
	
	

	}

}
