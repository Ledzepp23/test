package myFirstWebDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilities.DriverUtilities;

public class _08_NavigationCommands {

	WebDriver driver;
	
	@Before
	public void preConditions(){
		
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		System.out.println("Start the Test Case");
	}
	
	@Test
	public void openWebSite(){
		driver.get("http://www.bbc.co.uk");
		System.out.println(((RemoteWebDriver) driver).getCapabilities().getBrowserName());
		System.out.println(((RemoteWebDriver) driver).getCapabilities().getVersion());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		driver.quit();
	}
}
