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

public class TestScript5 extends BaseClass {
	@Test
	public void productBrandVerificationTest() throws IOException {

	    FileUtility flib = new FileUtility();
	    WebDriverutility wlib = new WebDriverutility();

	    driver.get(flib.getDataFromPropertiesFile("Url"));
	    wlib.waitForPageToLoad(driver);

	    WebElement search = driver.findElement(
	            By.xpath("//input[@placeholder='Search on Nykaa']")
	    );

	    search.sendKeys("Maybelline");
	    search.sendKeys(Keys.ENTER);

	    WebElement product = driver.findElement(
	            By.xpath("//h2[contains(.,'Maybelline New York Lifter Gel Lip Oil In Gel')]")
	    );

	    wlib.waitForElementPresent(driver, product);
	    product.click();

	    Assert.assertTrue(
	            driver.getPageSource().contains("Nykaa"),
	            "Brand information is not displayed"
	    );
	}

}
