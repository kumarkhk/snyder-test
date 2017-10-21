package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AosFlipkartHome;
import com.snyder.ui.object.IosFlipkartHome;

public class FlipkartHomePage {
	
	RemoteWebDriver driver;
	public FlipkartHomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSearchTextbox()
	{
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosFlipkartHome.searchTextbox);
		}
		else if(driverType.contains("IOSdriver"))
		{
			return driver.findElement(IosFlipkartHome.searchTextbox);
		}
		
		return null;
		
	}
	
	public WebElement  getAddTocart()
	{
		String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosFlipkartHome.addCart);
		}
		else if(driverType.contains("IOSDriver"))
		{
			return driver.findElement(IosFlipkartHome.addCart);
		}
		return null;
	}
	
	public WebElement getmenuIcon() throws InterruptedException
	{
		
		String driverType=driver.getClass().getName();
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosFlipkartHome.menuIcon);
		}
		else if(driverType.contains("IOSDriver"))
		{
			return driver.findElement(IosFlipkartHome.menuIcon);
		}
		return null;
	}

}
