package myLocatorInteraction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverUtilities;

public class _01_SendKeys {

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
		WebElement firstNameField = driver.findElement(By.name("j_username"));
		firstNameField.sendKeys("eaymb1");
		WebElement passwordField = driver.findElement(By.name("j_password"));
		passwordField.sendKeys("password");
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.sendKeys(Keys.RETURN);
		
	}
	
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		//driver.quit();
	}
}	

