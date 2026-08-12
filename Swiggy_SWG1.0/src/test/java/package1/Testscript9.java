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

public class Testscript9 extends BaseClass {
	@Test
	public void searchAndSortProductTest() throws IOException {

	    FileUtility flib = new FileUtility();
	    WebDriverutility wlib = new WebDriverutility();

	    driver.get(flib.getDataFromPropertiesFile("Url"));
	    wlib.waitForPageToLoad(driver);

	    WebElement search = driver.findElement(
	            By.xpath("//input[@placeholder='Search on Nykaa']")
	    );

	    search.sendKeys("Shampoo");
	    search.sendKeys(Keys.ENTER);

	    WebElement sort = driver.findElement(
	            By.xpath("//*[contains(text(),'Sort By')]")
	    );

	    wlib.waitForElementPresent(driver, sort);
	    sort.click();

	    Assert.assertTrue(
	            driver.getPageSource().contains("Sort"),
	            "Sort option is not displayed"
	    );
	}

}
