package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_use {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9503179798");//use send key
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("96969696");//wrong password use
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("969696");//correct pass use
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
