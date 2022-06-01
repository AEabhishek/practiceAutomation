package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FourthPage {
	
	@FindBy (xpath = "//input[@id='billing_first_name']")
	private WebElement FirstNmTxt;
	
	@FindBy (xpath = "//input[@id='billing_last_name']")
	private WebElement LastNmTxt;
	
	@FindBy (xpath = "//input[@id='billing_email']")
	private WebElement EmailTxt;
	
	@FindBy (xpath = "//input[@id='billing_address_1']")
	private WebElement AddressTxt;
	
	@FindBy (xpath = "//input[@id='billing_phone']")
	private WebElement PhoneNmTxt;
	
	//@FindBy (xpath = "//input[@id='billing_address_1']")
	//private WebElement ;
	
	@FindBy (xpath = "//input[@id='billing_city']")
	private WebElement cityNmTxt;
	
	@FindBy (xpath = "//input[@id='billing_postcode']")
	private WebElement PincdTxt;
	
	@FindBy (xpath = "//div[@id='s2id_billing_state']")
	private WebElement drpdnLnk;
	
	
	
	 public FourthPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
      }
	
	 public void mandatoryField(String Firstname,String Lastname,String Email,String Phonenumber,String Address,String Cityname,String Pincode )
	 {
		 FirstNmTxt.sendKeys(Firstname);
		 LastNmTxt.sendKeys(Lastname);
		 EmailTxt.sendKeys(Email);
		 AddressTxt.sendKeys(Address);
		 PhoneNmTxt.sendKeys(Phonenumber);
		 cityNmTxt.sendKeys(Cityname);
		 PincdTxt.sendKeys(Pincode);
		 drpdnLnk.click();
	 }
	

	//WebElement ele = driver.findElement(By.xpath(""));
	//Select st=new Select(ele);
	//st.selectByIndex(1);

}
