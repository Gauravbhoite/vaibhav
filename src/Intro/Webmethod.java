package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webmethod {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(100);
			
		driver.get("https://www.facebook.com/");
		



	}

}
