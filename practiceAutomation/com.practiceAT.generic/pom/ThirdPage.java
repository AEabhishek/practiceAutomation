package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage {
	
	@FindBy (xpath = "//a[@href='http://practice.automationtesting.in/checkout/']")
	private WebElement checkoutBTN;
	
	
	
	 public ThirdPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
    }
	
	 public void Procedtocheckout()
	 {
		 checkoutBTN.click();
	 }
	
	
}
