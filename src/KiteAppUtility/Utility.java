package KiteAppUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.utility.RandomString;

public class Utility 
{
	public static String readDataFromXcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
	File myfile=new File("D:\\\\velocity automation notes\\\\gaurav data selenium.xlsx");
    Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet4");
    String myValue = mySheet.getRow(row).getCell(cell).getStringCellValue();
    return myValue;
		
	}
public static void takescreenshot(WebDriver driver) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String random=RandomString.make(3);
	File dest=new File("D:\\\\screenshot\\\\myscreenshot"+random+".png");
	FileHandler.copy(src, dest);
}

}
