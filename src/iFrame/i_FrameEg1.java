package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_FrameEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//p[text()='Child Iframe']")).click();
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
driver.findElement(By.xpath("//body[text()='Parent frame']")).click();
	}

}
