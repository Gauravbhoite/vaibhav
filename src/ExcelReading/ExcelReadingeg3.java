package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingeg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("D:\\velocity automation notes\\gaurav data selenium.xlsx");
       Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
       
       //reading whole ROw,static method
       
       for(int i=0;i<=3;i++) 
       {
       String value = mysheet.getRow(0).getCell(i).getStringCellValue();
       System.out.println(value);
       
       }
       
       int lastRowNo = mysheet.getLastRowNum();
       int totalrowcount = lastRowNo;
       System.out.println(lastRowNo );
       
       int lastCellNo = mysheet.getRow(0).getLastCellNum()-1;
       int totalcellcount = lastCellNo-1;
      System.out.println(lastCellNo);
       
      
      
      //dyanamic coding
       for(int i=0;i<=totalrowcount;i++)
       {
    	   String value = mysheet.getRow(0).getCell(i).getStringCellValue();
    	   System.out.println(value);
    	  
       }
       
       
	}

}
