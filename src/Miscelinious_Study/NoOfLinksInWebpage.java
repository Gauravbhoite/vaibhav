package Miscelinious_Study;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksInWebpage {

 public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	        driver.get("https://vctcpune.com/selenium/practice.html");
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	       
	          List<WebElement> link = driver.findElements(By.tagName("a"));
	       System.out.println(link.size());
	       
	       //print all links using iterator
	       
	        Iterator<WebElement> it = link.iterator();
	       while(it.hasNext())
	       {
	    	   System.out.println(it.next().getText());
	       }

	}

}
