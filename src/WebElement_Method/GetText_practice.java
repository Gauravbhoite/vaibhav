package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_practice {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	        driver.get("https://vctcpune.com/selenium/practice.html");
	        Thread.sleep(500);
	        
	      WebElement element12 = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));//Refrence variable
	      
	     String actualtext = element12.getText();
	    {
	    	  //System.out.println(text);
	    }
	      String expected ="Velocity Corporate Training Center";
	      
	     if (actualtext.equals(expected))
	     {
	    	 System.out.println("text is matching TC is pass");
	     }
	     else
	     {
	    	 System.out.println("text is not matching TC is fail");
	     }
	}

	}
