package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;	

public class InstagramGooglePO extends BasePage {

	public InstagramGooglePO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinksSize() {
		return allLinks.size();
	}
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement instaSrchResLink;
	public WebElement instaSrchResLink() {
		return instaSrchResLink;
	}
	
	
}
