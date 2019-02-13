package MyLocator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverUtilities;

public class _03_LocatingBycssSelector {
	
WebDriver driver;
	
	@Before
	public void preConditions(){
		
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		System.out.println("Start the Test Case");
	}
	
	@Test
	public void something(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/buyStock.html");
		WebElement username = driver.findElement(By.name("j_username"));
		username.sendKeys("eaymb1");
		WebElement password = driver.findElement(By.name("j_password"));
		password.sendKeys("password");
		driver.findElement(By.name("submit")).click();
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/buyStock.html");
		

//		WebElement buyStockLink = driver.findElement(By.xpath("//*[@id='tabs25']/ul/li[5]/a"));
//		buyStockLink.click();
		
		WebElement firstNameField = driver.findElement(By.cssSelector("input[value='ABF.L']"));
		firstNameField.click();

	}
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		//driver.quit();
	}
}
