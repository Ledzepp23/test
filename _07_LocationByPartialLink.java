package MyLocator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverUtilities;

public class _07_LocationByPartialLink {

	WebDriver driver;
	
	@Before
	public void preConditions(){
		
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		System.out.println("Start the Test Case");
	}
	
	@Test
	public void something(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN");
		WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("Forgot"));
		forgotPasswordLink.click();


		

	}
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		//driver.quit();
	}
}