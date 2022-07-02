package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(500);
        
        WebElement element11 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));//create refrence variable
      String actualtext = element11.getText();
      String expectedtext="Facebook helps you connect and share with the people in your life.";
       //System.out.println(mytext);
      
      if(actualtext.equals(expectedtext))
{
	System.out.println("text is matching and TC is passed");
}
      else 
      {
    	  System.out.println("text is not matching and TC is failed");
      } 
      
      
	}

}
