package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingeg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	File myfile=new File("D:\\velocity automation notes\\gaurav data selenium.xlsx");
	
			

	String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(name);
	
	
	double name1 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(1).getCell(1).getNumericCellValue();
	
	System.out.println(name1);
	
	boolean name2 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(4).getCell(0).getBooleanCellValue();
	System.out.println(name2);
   String name3 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
   System.out.println(name3);
	}

}
