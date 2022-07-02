package DroupDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.name("cars"));
		
		//create a object of select class
		Select s=new Select(dropdown);
		
		boolean result = s.isMultiple();
		System.out.println("ismultiple result is "+result);
		Thread.sleep(5000);
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		System.out.println(s.isMultiple());
		
		Thread.sleep(5000);
		
		//how to Deselect
		s.deselectAll();//can be use only for multiple select table 
		//s.deselectByVisibleText("volvo");
		
		System.out.println(s.getFirstSelectedOption().getText());
		WebElement firstwebelement = s.getFirstSelectedOption();
		String mytext = firstwebelement.getText();
		System.out.println("1st selected option is "+mytext);
		
		System.out.println(s.getAllSelectedOptions().size());
		
		for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++);
		
		//System.out.println(s.getFirstSelectedOption().get);
	}

}
