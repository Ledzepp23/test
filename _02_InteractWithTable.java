package myLocatorInteraction;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverUtilities;

public class _02_InteractWithTable {

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
		WebElement buyStock = driver.findElement(By.linkText("Buy Stock"));
		buyStock.click();
		WebElement beginsWithS = driver.findElement(By.xpath("//*[@id='main']/a[17]"));
		beginsWithS.click();
		WebElement table = driver.findElement(By.xpath("//div/form/table/tbody"));
		List <WebElement> rowsInTable = table.findElements(By.tagName("tr"));
		int rowNumber = 0;
		for (WebElement row: rowsInTable)
		{
			rowNumber ++;
			System.out.println("Contents of row " + rowNumber + ":\t" + row.getText());
		}
		driver.quit();
	}
	
	@Test
	public void something2(){
//		driver.get("http://unxbtn001/TradingPlatform_CLEAN/registration.html");
//		WebElement firstNameField = driver.findElement(By.id("firstName"));
//		firstNameField.sendKeys("mike");
//		WebElement lastNameField = driver.findElement(By.id("lastName"));
//		lastNameField.sendKeys("brooks");
//		WebElement emailField = driver.findElement(By.id("email"));
//		emailField.sendKeys("mike@mike.com");
//		WebElement usernameField = driver.findElement(By.id("username"));
//		usernameField.sendKeys("eaymb2");
//		WebElement passwordField = driver.findElement(By.id("password"));
//		passwordField.sendKeys("password");
//		WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
//		confirmPasswordField.sendKeys("password");
//		WebElement questionField = driver.findElement(By.name("answer"));
//		questionField.sendKeys("me");
//		WebElement confirmQuestionField = driver.findElement(By.name("confirmAnswer"));
//		confirmQuestionField.sendKeys("me");
//		WebElement submitButton = driver.findElement(By.xpath("//*[@id='user']/table/tbody/tr[11]/td[2]/input[1]"));
//		submitButton.click();
		
		driver.get("http://unxbtn001/TradingPlatform_CLEAN");
		WebElement firstNameFieldLogin = driver.findElement(By.name("j_username"));
		firstNameFieldLogin.sendKeys("eaymb2");
		WebElement passwordFieldLogin = driver.findElement(By.name("j_password"));
		passwordFieldLogin.sendKeys("password");
		WebElement submitButtonLogin = driver.findElement(By.name("submit"));
		submitButtonLogin.sendKeys(Keys.RETURN);
		WebElement buyStock = driver.findElement(By.linkText("Buy Stock"));
		buyStock.click();
		WebElement beginsWithS = driver.findElement(By.xpath("//*[@id='main']/a[17]"));
		beginsWithS.click();
		WebElement table = driver.findElement(By.xpath("//div/form/table/tbody"));
		List <WebElement> rowsInTable = table.findElements(By.tagName("tr"));
		int rowNumber = 0;
		for (WebElement row: rowsInTable)
		{
			rowNumber ++;
			String[] rowContents = row.getText().split(" ");
			if(rowContents[0].equals("SSE"))
			{
				assertEquals(rowContents[2],"15.65");
			}
		}
	}
	
	@Test
	public void something3(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN");
		WebElement firstNameField = driver.findElement(By.name("j_username"));
		firstNameField.sendKeys("eaymb1");
		WebElement passwordField = driver.findElement(By.name("j_password"));
		passwordField.sendKeys("password");
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.sendKeys(Keys.RETURN);
		WebElement buyStock = driver.findElement(By.linkText("Buy Stock"));
		buyStock.click();
		
		WebElement tableCell = driver.findElement(By.xpath("//*[@id='ADM.L']/td[1]"));
		assertEquals(tableCell.getText(),"ADMIRAL GROUP");

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
		WebElement buyStock = driver.findElement(By.linkText("Buy Stock"));
		buyStock.click();
		WebElement beginsWithN = driver.findElement(By.xpath("//*[@id='main']/a[13]"));
		beginsWithN.click();
		WebElement radioField = driver.findElement(By.cssSelector("input[type='radio']"));
		radioField.click();
		
		assertTrue(radioField.isSelected());
		


	}
	
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		//driver.quit();
	}
	
}
