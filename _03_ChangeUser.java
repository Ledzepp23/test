package myLocatorInteraction;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.DriverUtilities;

public class _03_ChangeUser {

WebDriver driver;
	
	@Before
	public void preConditions(){
		
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		System.out.println("Start the Test Case");
	}

	@Test
	public void something4(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN");
		WebElement firstNameFieldLogin = driver.findElement(By.name("j_username"));
		firstNameFieldLogin.sendKeys("eaymb2");
		WebElement passwordFieldLogin = driver.findElement(By.name("j_password"));
		passwordFieldLogin.sendKeys("password");
		WebElement submitButtonLogin = driver.findElement(By.name("submit"));
		submitButtonLogin.sendKeys(Keys.RETURN);
		WebElement buyStock = driver.findElement(By.linkText("My Profile"));
		buyStock.click();
		WebElement change = driver.findElement(By.cssSelector("input[value='Change']"));
		change.click();
		
		Select myElementToSelect = new Select(driver.findElement(By.name("title")));
		myElementToSelect.selectByVisibleText("Dr");
		System.out.println("Currently selected dropdown item: " + myElementToSelect.getFirstSelectedOption().getText());

	}
	
	@Test
	public void something5(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN");
		WebElement firstNameFieldLogin = driver.findElement(By.name("j_username"));
		firstNameFieldLogin.sendKeys("eaymb2");
		WebElement passwordFieldLogin = driver.findElement(By.name("j_password"));
		passwordFieldLogin.sendKeys("password");
		WebElement submitButtonLogin = driver.findElement(By.name("submit"));
		submitButtonLogin.sendKeys(Keys.RETURN);
		WebElement buyStock = driver.findElement(By.linkText("Check Balance"));
		buyStock.click();
		WebElement newAccount = driver.findElement(By.linkText("Add New Account"));
		newAccount.click();
		
		WebElement currencyField = driver.findElement(By.name("currency"));
		Select myElementToSelect = new Select(currencyField);
		List<WebElement> options = myElementToSelect.getOptions();
		for(WebElement result : options)
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
