package pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;	

public class TwitterGooglePO extends BasePage {

	public TwitterGooglePO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinksSize() {
		return allLinks.size();
	}
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement twitterSrchResLink;
	public WebElement twitterSrchResLink() {
		return twitterSrchResLink;
	}

}
