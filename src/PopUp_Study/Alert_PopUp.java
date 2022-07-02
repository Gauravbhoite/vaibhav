package PopUp_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		//1.to handel alert popup we need to switch selenium focus from main page to alert popupby using syntax
		
		Alert alt = driver.switchTo().alert();
		
		//2.alert is an interface which contain abstract method like gettext();
		// following method using gettext
		System.out.println(alt.getText());
		
		//following method use to click on ok button
		alt.accept();//use to click on ok button(we cannot inspect when alert popup on display)
		
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		
		Alert alt1 = driver.switchTo().alert();
		
		System.out.println(alt1.getText());
		
		alt1.accept();

	}

}
