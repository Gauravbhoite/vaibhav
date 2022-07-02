package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellReadingEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("D:\\velocity automation notes\\gaurav data selenium.xlsx");
         Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
         
         //i want to read one coloum
         
         //ststic coding
         
//         for(int i=0;i<=3;i++)
//         {
//        	 String value = mysheet.getRow(i).getCell(2).getStringCellValue();
//        	 System.out.println(value);
//         }
         
         
         //Dynamic coding
         int lastrowno = mysheet.getLastRowNum();
         int lastrowcount = lastrowno;
         
         for(int i=0;i<=lastrowcount;i++)
         {
        	 String value1 = mysheet.getRow(i).getCell(2).getStringCellValue();
        	 System.out.println(value1);
         }

	}

}
