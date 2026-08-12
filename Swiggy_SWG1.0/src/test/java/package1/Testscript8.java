package package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swiggy.BaseclassUtility.BaseClass;
import com.swiggy.FileUtility.FileUtility;
import com.swiggy.WebDriverUtility.WebDriverutility;

public class Testscript8 extends BaseClass{
	@Test
	public void verifyShoppingBagIconTest() throws IOException {

	    FileUtility flib = new FileUtility();
	    WebDriverutility wlib = new WebDriverutility();

	    driver.get(flib.getDataFromPropertiesFile("Url"));
	    wlib.waitForPageToLoad(driver);

	    WebElement bag = driver.findElement(
	            By.xpath("//button[@id='header-bag-icon']")
	    );

	    Assert.assertTrue(
	            bag.isDisplayed(),
	            "Shopping Bag icon is not displayed"
	    );
	}

}
