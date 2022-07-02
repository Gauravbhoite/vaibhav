package Miscelinious_Study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementUnordered {

	public static void main(String[] args ) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		 driver.findElement(By.name("q")).sendKeys("honda");
		 List<WebElement> serchresults = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1]//li)"));
		
//		for(WebElement serch:serchresults)
//		{
//			System.out.println(serch.getText());
//		}
		String expectedResult = "honda amaze";
		
		for( WebElement result:serchresults)
		{
			System.out.println(result.getText());
			String actualResult = result.getText();
			
			if(actualResult.equals(expectedResult))
			{
				result.click();
				break;
			}
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.linkText("Images")).click();//link path locater
		//driver.findElement(By.partialLinkText("ima")).click();//partial link path locater
	}

}
