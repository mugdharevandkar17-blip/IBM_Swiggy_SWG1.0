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

public class Testscript1 extends BaseClass {
	@Test
	public void searchToProductDetailsTest() throws IOException {

	    FileUtility flib = new FileUtility();
	    WebDriverutility wlib = new WebDriverutility();

	    driver.get(flib.getDataFromPropertiesFile("Url"));
	    wlib.waitForPageToLoad(driver);

	    WebElement search = driver.findElement(
	            By.xpath("//input[@placeholder='Search on Nykaa']")
	    );

	    search.sendKeys("Lipstick");
	    search.sendKeys(Keys.ENTER);

	    WebElement product = driver.findElement(
	            By.xpath("//h2[contains(.,'Lipstick')]")
	    );

	    wlib.waitForElementPresent(driver, product);
	    product.click();

	    Assert.assertTrue(
	            driver.getPageSource().toLowerCase().contains("lipstick"),
	            "Product details page is not displayed"
	    );
	}

}
