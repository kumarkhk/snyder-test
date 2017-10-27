package com.snyder.test.regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.snyder.test.config.CreateDriver;
import com.snyder.ui.repo.FlipkartHomePage;
import com.snyder.ui.repo.MenuItemsPage;
import com.snyder.ui.repo.OfferZonePage;

import io.appium.java_client.AppiumDriver;

public class OfferZoneTest {
	
	
	FlipkartHomePage home_page;
	MenuItemsPage menu_page;
	OfferZonePage offer_page;
	AppiumDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception
	{
		driver=CreateDriver.getDriverInstance();
		home_page=new FlipkartHomePage(driver);
		menu_page=new MenuItemsPage(driver);
		offer_page=new OfferZonePage(driver);
		home_page.getSkipIcon().click();
		home_page.getmenuIcon().click();
		menu_page.getOfferZoneTab().click();
		
	}
	
	@Test(priority=01)
	public void navigateFashionLifeStyleTabTest()
	{
		offer_page.getFashionLifeStyleTab().click();
		
		
	}
	
	@Test(priority=02)
	public void navigateMobilesTabletsTabTest()
	{
		offer_page.getMobilesTabletsTab().click();
		
		
	}
	
	@Test(priority=03)
	public void navigateElectronicsTabTest()
	{
		offer_page.getElectronicsTab().click();
		
		
	}
	
	@Test(priority=04)
	public void navigateTvsAppliancesTabTest()
	{
		offer_page.getTvsAppliancesTab().click();
		
		
	}
	@Test(priority=05)
	public void navigateHomeFurnitureTabTest()
	{
		offer_page.getHomeFurnitureTab().click();
		
		
	}
	
	@Test(priority=06)
	public void navigateCarsBikesTest()
	{
		offer_page.getCarsBikesTab().click();
		
		
	}
	
	@Test(priority=07)
	public void navigateBooksStationeryTest()
	{
		offer_page.getBooksSationeryTab().click();
		
		
	}
	
	@AfterClass
	public void tearDown() throws Exception
	{
		//Thread.sleep(5000);
		driver.closeApp();
	}


}
