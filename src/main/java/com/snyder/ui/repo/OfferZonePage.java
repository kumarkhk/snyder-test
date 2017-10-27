package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AosOfferZonePage;

public class OfferZonePage {
	
	RemoteWebDriver driver;
	
	
	public OfferZonePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getDetailsOfTheDayTab()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosOfferZonePage.dealsOfTheDayTab);
		}else if(driverType.contains("IOSDriver"))
		{
			
		}
		
		return null;
		
	}
	public WebElement getFashionLifeStyleTab()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosOfferZonePage.fashoin_LifeStyleTab);
		}else if(driverType.contains("IOSDriver"))
		{
			
		}
		
		return null;
		
	}
	
	public WebElement getMobilesTabletsTab()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosOfferZonePage.mobiles_TabletsTab);
		}else if(driverType.contains("IOSDriver"))
		{
			
		}
		
		return null;
		
	}
	
	public WebElement getElectronicsTab()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosOfferZonePage.electronicsTab);
		}else if(driverType.contains("IOSDriver"))
		{
			
		}
		
		return null;
		
	}
	
	public WebElement getTvsAppliancesTab()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosOfferZonePage.tvs_AppliancesTab);
		}else if(driverType.contains("IOSDriver"))
		{
			
		}
		
		return null;
		
	}
	
	public WebElement getHomeFurnitureTab()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosOfferZonePage.home_FurnitureTab);
		}else if(driverType.contains("IOSDriver"))
		{
			
		}
		
		return null;
		
	}
	
	public WebElement getCarsBikesTab()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosOfferZonePage.cars_BikesTab);
		}else if(driverType.contains("IOSDriver"))
		{
			
		}
		
		return null;
		
	}
	
	public WebElement getBooksSationeryTab()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosOfferZonePage.books_StationeryTab);
		}else if(driverType.contains("IOSDriver"))
		{
			
		}
		
		return null;
		
	}
	
	public void clickOnDetailsOfTheDayTab()
	{
		getDetailsOfTheDayTab().click();
		
		//return driver;
	}

}
