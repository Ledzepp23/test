package myFirstWebDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utilities.DriverUtilities;

public class _03_NavigationCommands {

WebDriver driver;
	
	@Before
	public void preConditions(){
		
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		System.out.println("Start the Test Case");
	}
	
	@Test
	public void openWebSite(){
		driver.get("http://www.google.co.uk");
	}
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		driver.quit();
	}
}
