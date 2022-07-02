package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInToView {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		  WebElement HideShowButton = driver.findElement(By.id("hide-textbox"));
		 
		  Thread.sleep(1000);
         JavascriptExecutor js = ((JavascriptExecutor)driver);
         Thread.sleep(1000);
         
		js.executeScript("arguments[0].scrollIntoView(true);",HideShowButton);
		Thread.sleep(100);
		HideShowButton.click();
		
	}

}
