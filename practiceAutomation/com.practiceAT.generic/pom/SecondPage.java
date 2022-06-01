package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	
	@FindBy (xpath = "//a[@href='/product/thinking-in-html/?add-to-cart=181']")
	private WebElement AddBasketBTN;
	
	@FindBy (xpath = "//a[@title='View Basket']")
	private WebElement ViewBasketBTN;
	
	
	
	 public SecondPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
      }
	
	 public void addbasket()
	 {
		 AddBasketBTN.click();
	 }
	 
	 public void viewbasket()
	 {
		 ViewBasketBTN.click();
	 }
	
	

}
