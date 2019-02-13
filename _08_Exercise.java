package MyLocator;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.DriverUtilities;

public class _08_Exercise {
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
		WebElement firstNameField = driver.findElement(By.id("lastName"));
		firstNameField.sendKeys("Parker");
	}
	
	@Test
	public void something2(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/registration.html");
		WebElement titleField = driver.findElement(By.name("title"));
		Select myElementToSelect = new Select(titleField);
		List<WebElement> options = myElementToSelect.getOptions();
		for(WebElement result : options)
		{
			System.out.println("Element: " + result.getText());
		}
		WebElement questionField = driver.findElement(By.name("question"));
		myElementToSelect = new Select(titleField);
		options = myElementToSelect.getOptions();
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