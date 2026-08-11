package Homepage;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.swiggy.BaseclassUtility.BaseClass;
import com.swiggy.WebDriverUtility.WebDriverutility;

public class NykaHomepage extends BaseClass {
	@Test
	public void verifyHomePage() {
		WebDriverutility wlib =new WebDriverutility();
		wlib.waitForPageToLoad(driver);
		String title=driver.getTitle();
		System.out.println("page title: " + title);
		Assert.assertTrue(title.toLowerCase().contains("nykaa"),"Nykaa homepage is not displayed");
		
		
	}

}
