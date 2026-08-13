package package1;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
	
}
