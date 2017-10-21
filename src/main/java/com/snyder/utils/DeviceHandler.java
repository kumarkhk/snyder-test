package com.snyder.utils;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DeviceHandler {
	
	public static void changeOrientationToPortrait(RemoteWebDriver driver)
	{
		String driverName=driver.getClass().getName();
		
		if(driverName.contains("AndroidDriver"))
		{
			AndroidDriver android_driver=(AndroidDriver) driver;
			ScreenOrientation current=android_driver.getOrientation();
			
			try
			{
				if(current.toString().equalsIgnoreCase("landscape"))
				{
					android_driver.rotate(ScreenOrientation.PORTRAIT);
				}
				
			}catch(Exception e)
			{
				System.err.println("Orientation will not be supported by the application");
			}
			
			
		}
		else if(driverName.contains("IOSDriver"))
		{
			IOSDriver ios_driver=(IOSDriver)driver;
			ScreenOrientation current=ios_driver.getOrientation();
			
			try
			{
				if(current.toString().equalsIgnoreCase("landscape"))
				{
					ios_driver.rotate(ScreenOrientation.PORTRAIT);
				}
				
			}catch(Exception e)
			{
				
			}
			
		}
	}
	
	public static void changeOrientationToLandscape(RemoteWebDriver driver)
	{
		String driverName=driver.getClass().getName();
		
		if(driverName.contains("AndroidDriver"))
		{
			AndroidDriver android_driver=(AndroidDriver)driver;
			ScreenOrientation current=android_driver.getOrientation();
			
			if(current.toString().equalsIgnoreCase("portrait"))
			{
				android_driver.rotate(ScreenOrientation.LANDSCAPE);
			}
			
		}
		else if(driverName.contains("IOSDriver"))
		{
			IOSDriver ios_driver=(IOSDriver) driver;
			ScreenOrientation current=ios_driver.getOrientation();
			if(current.toString().equalsIgnoreCase("portrait"))
			{
				ios_driver.rotate(ScreenOrientation.LANDSCAPE);
			}
		 
			
		}
		
	}
	
	public static void swipeRightToLeftScreen(AppiumDriver driver)
	{
		driver.swipe(1010, 820, 80, 820, 2000);
		
	}
	public static void swipeLeftToRight(AppiumDriver driver)
	{
		driver.swipe(80, 820, 1010, 820, 2000);
	}

}
