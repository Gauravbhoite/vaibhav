package KiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingProperty 

{
//public static void takescreenshot(WebDriver driver) throws IOException
//{
//	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	String random=RandomString.make(3);
//	File dest=new File("D:\\\\screenshot\\\\myscreenshot"+random+".png");
//	FileHandler.copy(src, dest);
//}

public static String readDataFromProperty(String key) throws IOException
{
	Properties prop=new Properties();
	FileInputStream myprop = new FileInputStream("C:\\Users\\Swapnil Bhoite\\eclipse-workspace\\selinium_project\\myproperty.properties");
	prop.load(myprop);
	String value = prop.getProperty(key);
	return value;
}


}
