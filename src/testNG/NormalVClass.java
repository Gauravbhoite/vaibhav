package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalVClass {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			

	}

}
