package DroupDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxeg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(1000);
		//step1: decide list box to handle and store in ref variable
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		//step2: create an object of select class and pass ref-element
		Select s=new Select(day);
		
		
		s.selectByVisibleText("8");
		Thread.sleep(1000);
		s.selectByIndex(9);
		Thread.sleep(1000);
		s.selectByValue("15");
		//System.out.println(s.isMultiple());
		
		WebElement month = driver.findElement(By.id("month"));
		//WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		
		s1.selectByIndex(5);
		Thread.sleep(1000);
		s1.selectByValue("9");
		Thread.sleep(1000);
		s1.selectByVisibleText("dec");
		//System.out.println(s1.isMultiple());
		
		
//		for(int i=0;i<=9;i++)
//		{
//			System.out.println(i);
//		}
//		for(int i=9;i>=0;i=i-1)
//		{
//			System.out.println(i);
//		}
		
		
		
		

	}

}
