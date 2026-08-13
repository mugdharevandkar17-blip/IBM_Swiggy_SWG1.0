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

public class Testscript16 extends BaseClass {
	@Test
	public void verifyAddToBagButtonTest() throws IOException {

	    FileUtility flib = new FileUtility();
	    WebDriverutility wlib = new WebDriverutility();

	    driver.get(flib.getDataFromPropertiesFile("Url"));
	    wlib.waitForPageToLoad(driver);

	    WebElement search = driver.findElement(
	        By.xpath("//input[@placeholder='Search on Nykaa']")
	    );

	    search.sendKeys("Shampoo");
	    search.sendKeys(Keys.ENTER);

	    WebElement product = driver.findElement(
	        By.xpath("//h2[contains(.,'Shampoo')]")
	    );

	    wlib.waitForElementPresent(driver, product);
	    product.click();

	    WebElement addToBag = driver.findElement(
	        By.xpath("//button[.//span[normalize-space()='Add to Bag']]")
	    );

	    wlib.waitForElementPresent(driver, addToBag);

	    Assert.assertTrue(
	        addToBag.isDisplayed(),
	        "Add to Bag button is not displayed"
	    );
	}

}
