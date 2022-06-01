package practiceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScenario {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://practice.automationtesting.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Thinking in HTML']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/product/thinking-in-html/?add-to-cart=181']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='View Basket']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/checkout/']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("")
		
	}

}
