package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_fb {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");//D:\\Gaurav\\chromedriver.exe
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//xpath by attribute
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//xpath by text
		
		//driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).click();
		
		//xpath by contains
		
		//text contains
		//driver.findElement(By.xpath("//h2[contains(text()='Facebook helps')]")).click();
		
		//attribute contains
		driver.findElement(By.xpath("//a[contains(@class,'8esh')]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(@tabindex,'4')]")).click();
		
Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(@aria-label,'Already have an account?')]")).click();
	}

}
