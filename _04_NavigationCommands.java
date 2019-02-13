package myFirstWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilities.DriverUtilities;

public class _04_NavigationCommands {

WebDriver driver;
	
	@Before
	public void preConditions(){
		
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		System.out.println("Start the Test Case");
	}
	
	@Test
	public void openWebSite() throws IOException{
		driver.get("http://www.bbc.co.uk");
		driver.navigate().refresh();
		driver.get("http://www.google.co.uk");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(((RemoteWebDriver) driver).getCapabilities().getBrowserName());
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Michael.Brooks\\screenshot.png"));
		System.out.println(scrFile);
	}
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		driver.quit();
	}
	
}
