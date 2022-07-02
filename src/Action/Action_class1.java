package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class1 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	//.3.move to element using mouse action
	
	Actions act=new Actions(driver);//create a action class
	
//	WebElement myelement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
//	Thread.sleep(2000);
//	act.moveToElement(myelement).perform();
//	Thread.sleep(2000);
	
	//.1.click using mouse action
	WebElement element = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
	Thread.sleep(2000);
	
//	//1st way
//	act.moveToElement(element).perform();
//	act.click().perform();
//	Thread.sleep(2000);
//	
//	//2nd way
//	act.moveToElement(element).click().build().perform();
//	
//	//3rd way
//	act.click(element).perform();
	
	//.2.Right click==>.2.context click
	
	//1st
	act.moveToElement(element).contextClick().build().perform();
	
	//2nd
	act.contextClick(element).click().perform();
	
	
	}
	

}
