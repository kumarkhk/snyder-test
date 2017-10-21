package com.snyder.test.config;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.snyder.utils.DeviceHandler;
import com.snyder.utils.ReadData;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class CreateDriver {
	
	public static AppiumDriver getDriverInstance()
	{
		AppiumDriver driver=null;
		
		try
		{
			DesiredCapabilities cap=new DesiredCapabilities();
			String driverType=ReadData.fromProperties("configuration", "driver");
			String appActivity=ReadData.fromProperties("configuration", "appActivity");
			String appPackage=ReadData.fromProperties("configuration", "appPackageName");
			String aosVersion=ReadData.fromProperties("configuration", "aosVersion");
			String iosVersion=ReadData.fromProperties("configuration", "iosVersion");
			String device=ReadData.fromProperties("configuration", "device");
			
			if(driverType.equals("aos"))
			{
				cap.setCapability("platformName", "Android");
				cap.setCapability("platformVersion", "5.0");
				cap.setCapability("deviceName", device);
				cap.setCapability("appPackage", appPackage);
				cap.setCapability("appActivity", appActivity);
				driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			}
			
			else if(driverType.equals("ios"))
			{
				cap.setCapability("platformName","IOS");
				cap.setCapability("platformVersion", iosVersion);
				cap.setCapability("UDID", "");
				cap.setCapability("buildeID", "");
				driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//DeviceHandler.enableNetwork(driver);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return driver;
	}

}
