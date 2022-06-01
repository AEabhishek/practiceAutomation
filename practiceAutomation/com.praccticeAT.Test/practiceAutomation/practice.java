package practiceAutomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import practiceAutomation.Excellibrary.ExlLibrary;

public class practice {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExlLibrary.openExcel(iconstantpath.EXCELPATH);
		 String firstName = ExlLibrary.getExcelfile("Sheet1", 1, 0);
		 String LastName = ExlLibrary.getExcelfile("Sheet1", 2, 0);
		 String CompanyName = ExlLibrary.getExcelfile("Sheet1", 1, 1);
			String email = ExlLibrary.getExcelfile("Sheet1", 1, 2);
		String phoneNumber = ExlLibrary.getExcelfile("Sheet1", 1, 3);
		 String Address = ExlLibrary.getExcelfile("Sheet1", 1, 4);
		 String city = ExlLibrary.getExcelfile("Sheet1", 1, 5);
		 String pincode = ExlLibrary.getExcelfile("Sheet1", 1, 6);
		
	}

}
