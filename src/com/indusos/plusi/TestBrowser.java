package com.indusos.plusi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBrowser {
	AndroidDriver<MobileElement> dr;
	WowCode wc= new WowCode();
	
	
	@Test
	public void setValue() throws MalformedURLException{
		
		DesiredCapabilities capablities = new DesiredCapabilities();
		 
		capablities.setCapability("deviceName","Redmi Note 4");
		capablities.setCapability("platformVersion","5.1");
		capablities.setCapability("platformName","Android");
		// Mofirst Launcher
		capablities.setCapability("appPackage","com.android.browser");
		capablities.setCapability("appActivity","com.android.browser.BrowserActivity");
		// For MI Launcher
		//capablities.setCapability("appPackage","com.miui.home");
		//capablities.setCapability("appActivity","com.miui.home.launcher.Launcher");
		
		dr= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capablities);
		dr.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		
//	dr.findElement(By.id(id));
	}
	public void URL(){
		
		dr.get("http://www.google.co.in");
	}

}
