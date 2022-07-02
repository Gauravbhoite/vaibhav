package Scrolling;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		System.out.println(driver.manage().window().getPosition());
		
		//To set Position--> use Point class and create object of Point class
		
		Point p=new Point(70, 10);//x and y cordinate

       
		//driver.manage().window().setPosition(p);

	}

}