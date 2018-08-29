package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,20);
	}

	public void CheckTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title Match", true);
		} catch (Exception e) {
			Reporter.log("Title Not Match", true);
		}
		
		}
	public void CheckWebElement(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("WebElement Match",true);
		} catch (Exception e) {
			Reporter.log("WebElement Not Match",true);
			
		}
	}
}
