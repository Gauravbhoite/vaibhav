package Scrolling;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			driver.manage().window().maximize();
			Thread.sleep(1000);
			System.out.println(driver.manage().window().getSize());

			//to set size===>create object of Dimension class
			Dimension d= new Dimension(1000, 10);//lenght and weidth
			
			//driver.manage().window().setSize(d);

			System.out.println(driver.manage().window().getSize());
	}

}
