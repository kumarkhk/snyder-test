package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AosMenuItems;
import com.snyder.ui.object.IosMenuItems;

public class MenuItemsPage {
	
	RemoteWebDriver driver;
	
	public MenuItemsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getMyAccount()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosMenuItems.myAccount);
		}
		else if(driverType.contains("IOSDriver"))
		{
			return driver.findElement(IosMenuItems.myAccount);
		}
		
		return null;
	}

}
