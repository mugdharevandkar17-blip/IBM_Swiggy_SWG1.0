package package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swiggy.BaseclassUtility.BaseClass;
import com.swiggy.FileUtility.FileUtility;
import com.swiggy.WebDriverUtility.WebDriverutility;

public class Testscript11 extends BaseClass {
	@Test
	public void productFilterTest() throws IOException {

	    FileUtility flib = new FileUtility();
	    WebDriverutility wlib = new WebDriverutility();

	    driver.get(flib.getDataFromPropertiesFile("Url"));
	    wlib.waitForPageToLoad(driver);

	    WebElement search = driver.findElement(
	            By.xpath("//input[@placeholder='Search on Nykaa']")
	    );

	    search.sendKeys("Lipstick");
	    search.sendKeys(Keys.ENTER);

	    WebElement filter = driver.findElement(
	            By.xpath("//*[contains(text(),'Sort By') or contains(text(),'Filter')]")
	    );

	    wlib.waitForElementPresent(driver, filter);

	    Assert.assertTrue(
	            filter.isDisplayed(),
	            "Filter/Sort option is not displayed"
	    );
	}

}
