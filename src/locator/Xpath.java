package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(100);
		
	//	1.	xpath by attribute
		   //Syntax :
		   //tagname[@attribute name = ‘attribute value’]

		//driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		//driver.findElement(By.xpath("//div[@data-sstype='slide]")).click();
		
	 //2.	xpath by text
		    //Syntax :
		   //tagname[text() = ‘textvalue’]
		
		//driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();
		
	 //3.	xpath by contains()
		//a.	Here we can mention the substring without writing a whole text, when link is big in size.
		//b.	If any non-breakable space (nbsp) is there.
		
		//We can use contains in two ways :
		
	//I.	Contains with text() :
		//tagname[contains(text(),’textvalue’)]
		
		//driver.findElement(By.xpath("//h1[contains( text(),'Our Social Media'),]")).click();
		
	//II.	Contains with attribute :
		//tagname[contains(@attribute name, ‘attribute value’)]
		
		

	}
	

}
