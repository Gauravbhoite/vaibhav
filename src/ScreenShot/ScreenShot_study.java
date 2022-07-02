							package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot_study {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//String random=RandomString.make(3);
		//System.out.println(random);
		
		File destination=new File("D:\\screenshot\\myscreenshot.png");
		FileHandler.copy(source, destination);

	}

}
