package ZeroDha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kites {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
      
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://kite.zerodha.com/");
      driver.manage().window().maximize();
      Thread.sleep(5000);
      
      WebElement username = driver.findElement(By.id("userid"));
      WebElement passward = driver.findElement(By.id("password"));
      WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
      
      username.sendKeys("ELR321");
      passward.sendKeys("Dhana1111");
      login.click();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
      
      WebElement id = driver.findElement(By.id("pin"));
      WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
      
      id.sendKeys("982278");
      submit.click();
      
       WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
      String actualuserid = userid.getText();
      String expecteduserid = "ELR321";
      if(actualuserid.equals(expecteduserid))
      {
    	System.out.println("userid is matching test data is pass");  
      }
      else
      {
    	  System.out.println("userid is not match test data is fail");
      }
      userid.click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//a[@target='_self']")).click();
      Thread.sleep(1000);
      
      driver.close();
      
    	  
      
      
      
	}

}
