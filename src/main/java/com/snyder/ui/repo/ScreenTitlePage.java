package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AosMenuItems;
import com.snyder.ui.object.AosTitleScreen;

public class ScreenTitlePage {
	
	RemoteWebDriver driver;
	
	public ScreenTitlePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getElectronicsTitle()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosTitleScreen.electronicsTitle);
		}
		else if(driverType.contains("IOSDriver"))
		{
			//return driver.findElement(IosMenuItems.myAccount);
		}
		return null;
	}
	
	public WebElement getTvAppliancesTitle()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosTitleScreen.tv_appliances);
		}
		else if(driverType.contains("IOSDriver"))
		{
			//return driver.findElement(IosMenuItems.myAccount);
		}
		return null;
	}
	
	public WebElement getFashionTitle()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosTitleScreen.fashoinTitle);
		}
		else if(driverType.contains("IOSDriver"))
		{
			//return driver.findElement(IosMenuItems.myAccount);
		}
		return null;
	}

	public WebElement getHomeFurnitureTitle()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosTitleScreen.home_furnitureTitle);
		}
		else if(driverType.contains("IOSDriver"))
		{
			//return driver.findElement(IosMenuItems.myAccount);
		}
		return null;
	}
}
