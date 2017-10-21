package com.snyder.test.config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SamplTest {

	public static void main(String[] args) throws MalformedURLException {
		
		String Appium_Node_Path="C:/Program Files/nodejs/node.exe";
		String Appium_JS_Path="C:/Users/win8/AppData/Local/Programs/appium-desktop/resources/app/node_modules/appium/lib/main.js";
		
		AppiumDriverLocalService appiumService;

		appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4723)
			                .usingDriverExecutable(new File(Appium_Node_Path)).
			                withAppiumJS(new File(Appium_JS_Path)));
		appiumService.start();
        
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.0.0");
		cap.setCapability("deviceName", "Emulator");
		cap.setCapability("appPackage", "com.flipkart.android");
		cap.setCapability("appActivity", "com.flipkart.android.SplashActivity");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.getConnection();

	}

}
