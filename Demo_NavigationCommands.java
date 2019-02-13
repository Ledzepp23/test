package myFirstWebDriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utilities.DriverUtilities;

public class Demo_NavigationCommands {

	@Test
	public void openWebSite(){
		
		DriverUtilities myDriverUtilities = new DriverUtilities();
		WebDriver driver = myDriverUtilities.getDriver();
		
		System.out.println("Start the test Case");
		driver.get("http://www.google.com");
		System.out.println("End of test case");
	}
}
