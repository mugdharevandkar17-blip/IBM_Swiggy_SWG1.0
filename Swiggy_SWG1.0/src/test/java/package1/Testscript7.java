package package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swiggy.BaseclassUtility.BaseClass;
import com.swiggy.FileUtility.FileUtility;
import com.swiggy.WebDriverUtility.WebDriverutility;

public class Testscript7 extends BaseClass {
	@Test
	public void verifySearchBoxTest() throws IOException {

	    FileUtility flib = new FileUtility();
	    WebDriverutility wlib = new WebDriverutility();

	    driver.get(flib.getDataFromPropertiesFile("Url"));
	    wlib.waitForPageToLoad(driver);

	    WebElement search = driver.findElement(
	            By.xpath("//input[@placeholder='Search on Nykaa']")
	    );

	    Assert.assertTrue(
	            search.isDisplayed(),
	            "Search box is not displayed"
	    );
	}

}
