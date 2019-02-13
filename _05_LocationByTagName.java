package MyLocator;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverUtilities;

public class _05_LocationByTagName {

	WebDriver driver;
	
	@Before
	public void preConditions(){
		
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		System.out.println("Start the Test Case");
	}
	
	@Test
	public void something(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/registration.html");
		List<WebElement> results = driver.findElements(By.tagName("H3"));
		for(WebElement result : results)
		{
			System.out.println("Element: " + result.getText());
		}

	}
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		//driver.quit();
	}
}
