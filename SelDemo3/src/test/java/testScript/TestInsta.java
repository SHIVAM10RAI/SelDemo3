package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePO;
import pom.InstagramGooglePO;

public class TestInsta extends BaseTest{
	
	@Test
	public void InstagramTest() {
		try {
			GooglePO googlePO=new GooglePO(driver);
			googlePO.googleSrch("Instagram");
			InstagramGooglePO InstaGoPO=new InstagramGooglePO(driver);
			Reporter.log("Total no. of Links = "+InstaGoPO.allLinksSize(),true);
			InstaGoPO.instaSrchResLink().click();
			String eTitle="Instagram";
			InstaGoPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}

}

