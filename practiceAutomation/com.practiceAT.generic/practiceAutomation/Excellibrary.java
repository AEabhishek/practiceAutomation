package practiceAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellibrary {
	
	public static class ExlLibrary {
		
		
		static Workbook wb;
		public static void openExcel(String excelfilepath) throws EncryptedDocumentException, IOException
		{
			
	FileInputStream fis =new FileInputStream(excelfilepath);
			
			wb=WorkbookFactory.create(fis);
			
		}
		
		public static String getExcelfile(String SheetName,int rownumber,int cellnumber) throws IOException 
		{
			
			  String data = wb.getSheet(SheetName).getRow(rownumber).getCell(cellnumber).getStringCellValue();
			return data;
				
		}
		
		public static void closeExcel()
		{
			try {
				wb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
	}
}
