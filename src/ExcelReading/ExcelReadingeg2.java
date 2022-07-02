package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingeg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("D:\\velocity automation notes\\gaurav data selenium.xlsx");
		Workbook wb = WorkbookFactory.create(myfile);
	    Sheet sheet = wb.getSheet("sheet1");
		Row noofrow = sheet.getRow(0);    
		Cell noofcell = noofrow.getCell(1);
		CellType type = noofcell.getCellType();
		System.out.println(type);
		String stringval = noofcell.getStringCellValue();
		System.out.println(stringval);

	}

}
