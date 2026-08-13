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

public class Testscript14 extends BaseClass {
	@Test
	public void verifyDeliveryInformationTest() throws IOException {

	    FileUtility flib = new FileUtility();
	    WebDriverutility wlib = new WebDriverutility();

	    driver.get(flib.getDataFromPropertiesFile("Url"));
	    wlib.waitForPageToLoad(driver);

	    WebElement search = driver.findElement(
	        By.xpath("//input[@placeholder='Search on Nykaa']")
	    );

	    search.sendKeys("Face Wash");
	    search.sendKeys(Keys.ENTER);

	    WebElement product = driver.findElement(
	        By.xpath("//h2[contains(.,'Face Wash')]")
	    );

	    wlib.waitForElementPresent(driver, product);
	    product.click();

	    WebElement delivery = driver.findElement(
	        By.xpath("//*[contains(text(),'Delivery')]")
	    );

	    wlib.waitForElementPresent(driver, delivery);

	    Assert.assertTrue(delivery.isDisplayed(),
	        "Delivery information is not displayed");
	}
}
