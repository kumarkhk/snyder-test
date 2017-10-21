package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AosLoginPage;
import com.snyder.ui.object.IosLoginPage;

public class Loginpage {
	
	RemoteWebDriver driver;
	
	public Loginpage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getEmailOrPhoneTextbox()
	{
		String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosLoginPage.emailOrPhone);
		}
		else if(driverType.contains("IOSdriver"))
		{
			return driver.findElement(IosLoginPage.emailOrPhone);
		}
		return null;
	}
	
	public WebElement getPassWordText()
	{
        String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosLoginPage.password);
		}
		else if(driverType.contains("IOSdriver"))
		{
			return driver.findElement(IosLoginPage.password);
		}
		return null;
	}
	
	public WebElement getSignInButton()
	{
        String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosLoginPage.signIn);
		}
		else if(driverType.contains("IOSdriver"))
		{
			return driver.findElement(IosLoginPage.signIn);
		}
		return null;
		
	}
	
	public WebElement getCancelButton()
	{
		String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosLoginPage.cancel);
		}
		else if(driverType.contains("IOSdriver"))
		{
			return driver.findElement(IosLoginPage.cancel);
		}
		return null;
		
	}
	
	public  WebElement getCloseButton()
	{
		String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AosLoginPage.close);
		}
		else if(driverType.contains("IOSdriver"))
		{
			return driver.findElement(IosLoginPage.close);
		}
		return null;
		
	}
}
