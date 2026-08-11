package offer;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.swiggy.BaseclassUtility.BaseClass;
import com.swiggy.FileUtility.FileUtility;
import com.swiggy.WebDriverUtility.WebDriverutility;


public class OfferTest extends BaseClass {
	@Test
	public void verifyofferpage() throws Throwable {
		
		FileUtility flib=new FileUtility();
		WebDriverutility wlib= new WebDriverutility();
		
		String URL=flib.getDataFromPropertiesFile("Url");
		
		driver.get(URL);
		wlib.waitForPageToLoad(driver);
		driver.findElement(By.xpath("//div[@type='button']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Offers')]")).click();
		wlib.waitForPageToLoad(driver);
		String actualTitle=driver.getTitle();
		Assert.assertTrue(actualTitle.contains("Offer"),"Offer page is not displayed");
		System.out.println("Offer page is displayed successfully");
	
		
		
		
		
		
		
		
		
		
	}

}
