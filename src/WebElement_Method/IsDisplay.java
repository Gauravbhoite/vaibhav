package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement text = driver.findElement(By.id("displayed-text"));
		Thread.sleep(5000);
		boolean result = text.isDisplayed();
		System.out.println("text box status is "+result);
		Thread.sleep(500);
		text.sendKeys("hii");
		Thread.sleep(5000);
		
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		hide.click();
		boolean result1 = hide.isDisplayed();
		System.out.println("text box status is "+result1);
		
         
	}

}
