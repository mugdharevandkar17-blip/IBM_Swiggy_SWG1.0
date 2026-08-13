package package1;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swiggy.BaseclassUtility.BaseClass;

public class NykaTest1 extends BaseClass{
	@Test
	public void test1() {
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Nykaa"));
		System.out.println("successul");
	}
	@Test
	public void test2() {
		
		driver.findElement(By.xpath("//input[@class='css-13m99a4']")).sendKeys("sunscreen"+Keys.ENTER);
		WebElement text = driver.findElement(By.xpath("//h1[@class='css-c0pzm0']"));
		String actText = text.getText();
		Assert.assertTrue(actText.contains("Sun Care"));
		System.out.println("matched");
		
	}
	@Test
	public void test3() {
		driver.findElement(By.xpath("//li[@class='MegaDropdownHeadingbox']/a[text()='men']")).click();
		driver.findElement(By.xpath("//li[text()='Health & Nutrition']")).click();
		driver.findElement(By.xpath("//h1[@aria-label='Wellness, 1671 products available']"));
		
	}
	@Test
	public void test4() {
		driver.findElement(By.xpath("//span[text()='Store & Events']")).click()	;
		Set<String> allwindow = driver.getWindowHandles();
    	for( String id : allwindow) {
    		
    		@Nullable
			String title = driver.getTitle();
    		if(title.contains("stores"));
    		driver.switchTo().window(id);
    	}		
		String partialText="Find A Nykaa Store Near You";
        WebElement store = driver.findElement(By.xpath("//div[@class='css-jasdvx']"));
	    String actualText = store.getText();
	    Assert.assertEquals(partialText, actualText);
	    System.out.println("matched");
	}
	@Test
	public void test7() {
		driver.findElement(By.xpath("//span[text()='Help']")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
    	for( String id : allwindow) {
    		
    		@Nullable
			String title = driver.getTitle();
    		if(title.contains("Cosmetics"));
    		driver.switchTo().window(id);
    	}		
		Actions ac=new Actions(driver); 
		ac.scrollByAmount(0,500).perform();
		driver.findElement(By.xpath("//h2[text()='Chat with us']")).click();
		String partname="Help Center";
		WebElement name = driver.findElement(By.xpath("//p[@class='css-1tr5m7p e8pythv0']"));
	    String actname = name.getText();
	    Assert.assertEquals(partname, actname);
	    System.out.println("matching");
	}
	
}
