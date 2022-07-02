package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_seliniumExample {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(100);
		
		
		
		

	}

}
