package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelect {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement checkboox = driver.findElement(By.id("checkBoxOption1"));
		Thread.sleep(500);
		
		if(checkboox.isSelected())
		{
			System.out.println("checkboox is already selected ");
		}
		else
		{
			System.out.println("selecting checkbox now");
		}
		checkboox.click();
		if(checkboox.isSelected())
		{
			System.out.println("check boox is selected now");
		}
		else
		{}
		System.out.println("faile to select checkbbox");
		
		
	}

}
