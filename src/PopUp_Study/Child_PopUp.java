	package PopUp_Study;

import java.util.ArrayList;
import java.util.Set;

import org.checkerframework.common.value.qual.ArrayLen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_PopUp {

	private static String allids;

	public static void main(String[] args) throws InterruptedException
	{

System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Thread.sleep(1000);
		
		String idofmainpage = driver.getWindowHandle();//create of main page id(written typen is string)
		System.out.println("id of main page "+idofmainpage);
		
	   Set<String> allIds = driver.getWindowHandles();// create all page id 
	 
	   ArrayList<String> ar=new ArrayList<>(allIds);
	   
	   for(int i=0;i<=ar.size()-1;i++)
	   {
		   System.out.println(ar.get(i));
	   }
	   String mainpageid = ar.get(0);
	   String allpageid = ar.get(1);
	   //to switch child page
	   driver.switchTo().window(allpageid);
	   Thread.sleep(1000);
	   driver.manage().window().maximize();
	   driver.findElement(By.id("the7-search")).sendKeys("selenium");
       driver.close();//close current tab

	   Thread.sleep(1000);
	   
	   //to switch main page 
	   driver.switchTo().window(mainpageid);
	   Thread.sleep(1000);
	   driver.findElement(By.name("NewTab")).click();

	   
		
		

	}

}
