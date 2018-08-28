package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePO;
import pom.TwitterGooglePO;

public class TestTwitter extends BaseTest{
	
	@Test
	public void TwitterTest() {
		try {
			GooglePO googlePO=new GooglePO(driver);
			googlePO.googleSrch("Twitter");
			TwitterGooglePO TwitterGoPO=new TwitterGooglePO(driver);
			Reporter.log("Total no. of Links = "+TwitterGoPO.allLinksSize(),true);
			TwitterGoPO.twitterSrchResLink().click();
			String eTitle="Instagram";
			TwitterGoPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}

}

