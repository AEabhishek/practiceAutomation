package practiceAutomation;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.FirstPage;
import pom.FourthPage;
import pom.SecondPage;
import pom.ThirdPage;
import practiceAutomation.Excellibrary.ExlLibrary;

public class FirstScenario {
	public static void main(String[] args) throws InterruptedException, Throwable, IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		ExlLibrary.openExcel(iconstantpath.EXCELPATH);
		String firstName = ExlLibrary.getExcelfile("Sheet1", 1, 0);
		String LastName = ExlLibrary.getExcelfile("Sheet1", 2, 0);
		String email = ExlLibrary.getExcelfile("Sheet1", 1, 2);
		String phoneNumber = ExlLibrary.getExcelfile("Sheet1", 1, 3);
		String Address = ExlLibrary.getExcelfile("Sheet1", 1, 4);
		String city = ExlLibrary.getExcelfile("Sheet1", 1, 5);
		String pincode = ExlLibrary.getExcelfile("Sheet1", 1, 6);

		FirstPage firstpage=new FirstPage(driver);
		SecondPage secondpage=new SecondPage(driver);
		ThirdPage thirdpage=new ThirdPage(driver);
		FourthPage fourthPage=new FourthPage(driver);
		driver.get(iconstantpath.URL);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		firstpage.firstpage();
		Thread.sleep(3000);
		secondpage.addbasket();
		secondpage.viewbasket();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
		thirdpage.Procedtocheckout();
		Thread.sleep(2000);
		fourthPage.mandatoryField(firstName, LastName, email, phoneNumber, Address, city, pincode);
		Thread.sleep(3000);


	}

}
