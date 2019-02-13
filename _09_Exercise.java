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

public class _09_Exercise {

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
		firstNameField.sendKeys("m.murdock@test.com");
	}
	
	@Test
	public void something2(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/registration.html");
		//WebElement welcome = driver.findElement(By.xpath("//*[@id='header']/a/img"));
		//WebElement welcome = driver.findElement(By.xpath("//img[contains(@src,'header')]"));
		WebElement welcome = driver.findElement(By.xpath("//img[contains(@alt,'logo')]"));
		welcome.click();
	}
	
	@Test
	public void something3(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN");
		WebElement welcome = driver.findElement(By.linkText("Register"));
		welcome.click();
		driver.navigate().back();	
	}
	
	@Test
	public void something4(){
		driver.get("http://unxbtn001/TradingPlatform_CLEAN");
		WebElement welcome = driver.findElement(By.name("submit"));
		welcome.click();
			
	}
	
	
	
	
	@After
	public void tearDown(){
		System.out.println("End of test");
		//driver.quit();
	}
}	
