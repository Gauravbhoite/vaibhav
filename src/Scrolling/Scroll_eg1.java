package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scroll_eg1 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		
  JavascriptExecutor j = ((JavascriptExecutor)driver);
  Thread.sleep(2000);
  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2000));
  j.executeScript("window.scrollBy(90,900)");//+,+ =DOWN
  Thread.sleep(2000);
  j.executeScript("window.scrollBy(90,-900)");//+,- =UP
  Thread.sleep(2000);
  j.executeScript("window.scrollBy(-90,900)");//-,+ =DOWN
  Thread.sleep(2000);
  j.executeScript("window.scrollBy(-90,-900)");//-,- =UP
	}

}
