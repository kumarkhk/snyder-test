package com.snyder.test.smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.snyder.test.config.CreateDriver;
import com.snyder.ui.repo.FlipkartHomePage;
import com.snyder.ui.repo.Loginpage;
import com.snyder.ui.repo.MenuItemsPage;

import io.appium.java_client.AppiumDriver;

/**
 * 
 * @author Harikumar
 *
 */
public class TestLoginUS109 {
	
	AppiumDriver driver;
	FlipkartHomePage home_page;
	MenuItemsPage menu_items;
	Loginpage login_page;
	
	@BeforeMethod
	public void setUp()
	{
		driver=CreateDriver.getDriverInstance();
		home_page=new FlipkartHomePage(driver);
		menu_items=new MenuItemsPage(driver);
		login_page=new Loginpage(driver);
		
	}
	
	@Test
	public void testLoginSuccess() throws Exception
	{
		// click on menu icon
		home_page.getmenuIcon().click();
		//click on my account
		menu_items.getMyAccount().click();
		//click on email or phone textbox
		login_page.getEmailOrPhoneTextbox().click();
		//cancel none of the above
		login_page.getCancelButton().click();
		//enter text to email or phone text box
		login_page.getEmailOrPhoneTextbox().sendKeys("abc@gmail.com");
		//enter text to password text box
		login_page.getPassWordText().sendKeys("abcd");
		//click on sign inn button
		login_page.getSignInButton().click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.getOrientation();
		driver.quit();
	}

}
