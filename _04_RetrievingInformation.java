package myLocatorInteraction;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.DriverUtilities;

public class _04_RetrievingInformation {

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
		WebElement welcome = driver.findElement(By.xpath("//*[@id='header']/a"));
		System.out.println(welcome.getTagName());
	}
	
	@Test
	public void something2(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN");
		WebElement firstNameFieldLogin = driver.findElement(By.name("j_username"));
		firstNameFieldLogin.sendKeys("eaymb2");
		WebElement passwordFieldLogin = driver.findElement(By.name("j_password"));
		passwordFieldLogin.sendKeys("password");
		WebElement submitButtonLogin = driver.findElement(By.name("submit"));
		submitButtonLogin.sendKeys(Keys.RETURN);
		WebElement myDetails = driver.findElement(By.linkText("My Profile"));
		myDetails.click();
		WebElement changeButton = driver.findElement(By.cssSelector("input[type='submit']"));
		changeButton.click();
		WebElement titleInput = driver.findElement(By.xpath("//*[@id='changeUser']/table/tbody/tr[1]/td[2]/select"));
		Select myElementToSelect = new Select(titleInput);
		assertEquals(myElementToSelect.getFirstSelectedOption().getText(),"Mr");
		WebElement firstName = driver.findElement(By.xpath("//*[@id='changeUser']/table/tbody/tr[2]/td[2]/input"));
		assertEquals(firstName.getAttribute("value"),"mike");
	}
	
	@Test
	public void something3(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/registration.html");
		WebElement submitBox = driver.findElement(By.xpath("//*[@id='user']/table/tbody/tr[11]/td[2]/input[1]"));
		System.out.println(submitBox.getAttribute("value"));
		WebElement resetBox = driver.findElement(By.xpath("//*[@id='user']/table/tbody/tr[11]/td[2]/input[2]"));
		System.out.println(resetBox.getAttribute("value"));
	}

	@After
	public void tearDown(){
		System.out.println("End of test");
		//driver.quit();
	}
}