package Miscelinious_Study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementUnorderd1 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.name("q")).sendKeys("one plus 10r");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		  WebElement serchbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		  serchbutton.click();
		 List<WebElement> serchelement = driver.findElements(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
		 
		 
		 String expectedResult = "0 Reviews";
		 for(WebElement z:serchelement)
		 {
			 
			 System.out.println(z.getText());
			 String actualResult = z.getText();
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			 z.click();
			 z.click();
			 
			 
//		   WebElement serchelement2 = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]"));
//		  
//		   System.out.println(serchelement2.getText());
//		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//		   serchelement2.click();
		  
			 
			
			 
			 
		 }
	}

}
