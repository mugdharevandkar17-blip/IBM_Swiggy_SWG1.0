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

public class Testscript10 extends BaseClass{
	@Test
	public void searchAndVerifyProductPriceTest() throws IOException {

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
	            By.xpath("(//h2[contains(.,'Maybelline')])[1]")
	    );

	    wlib.waitForElementPresent(driver, product);
	    product.click();

	    WebElement price = driver.findElement(
	            By.xpath("//*[contains(text(),'₹')]")
	    );

	    wlib.waitForElementPresent(driver, price);

	    Assert.assertTrue(
	            price.isDisplayed(),
	            "Product price is not displayed"
	    );
	}

}
