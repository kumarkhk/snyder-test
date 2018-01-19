package com.snyder.test.smoke;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.snyder.test.config.CreateDriver;
import com.snyder.ui.repo.FlipkartHomePage;
import com.snyder.ui.repo.Loginpage;
import com.snyder.ui.repo.MenuItemsPage;
import com.snyder.ui.repo.ScreenTitlePage;

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
	ScreenTitlePage screen_title;
	
	@BeforeClass
	public void initializePageObjectClass() throws Exception
	{
		driver=CreateDriver.getDriverInstance();
		home_page=new FlipkartHomePage(driver);
		menu_items=new MenuItemsPage(driver);
		login_page=new Loginpage(driver);
		screen_title=new ScreenTitlePage(driver);
		home_page.getSkipIcon().click();
		
	}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		
		
	}
	
	
	@Test(priority=01)
	public void testElectronicsTitle() throws Exception
	{
		// click on menu icon
		home_page.getmenuIcon().click();
		//click on my account
		menu_items.getElectronicsTab().click();;
		String actualTitle=screen_title.getElectronicsTitle().getText();
		Assert.assertEquals(actualTitle, "Electronics");
		
	}
	
	@Test(priority=02)
	public void testTvAppliancesTitle() throws Exception
	{
		// click on menu icon
		home_page.getmenuIcon().click();
		//click on my account
		menu_items.getTvAppliancesTab().click();;
		String actualTitle=screen_title.getTvAppliancesTitle().getText();
		Assert.assertEquals(actualTitle, "TVs & Appliances");
		
	}
	
		
	@Test(priority=04)
	public void testFashoinTitle() throws Exception
	{
		home_page.getmenuIcon().click();
		menu_items.getFashoinTab().click();;
		String actualTitle=screen_title.getFashionTitle().getText();
		Assert.assertEquals(actualTitle, "Fashion");
	}
	
	@Test(priority=05)
	public void testHomeFurnitureTitle() throws Exception
	{
		home_page.getmenuIcon().click();
		menu_items.getHomeFurnitureTab().click();
		String actualTitle=screen_title.getHomeFurnitureTitle().getText();
		Assert.assertEquals(actualTitle, "Home and Furniture");
	}
	
	/*@Test(priority=03)
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
	}*/
	
	
	@AfterMethod
	public void tearDown()
	{


		// it will close the opened application
		//driver.closeApp();
		
		

	}
	
	@AfterClass
	public void closeApplication()
	{
		driver.closeApp();
		driver.close();
		
	}

}
