package com.minusone.indus;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Setmobiledetails {
	@BeforeTest
	public void SetDetails(AndroidDriver<MobileElement>dr) throws MalformedURLException{
		DesiredCapabilities capablities = new DesiredCapabilities();
		 
		capablities.setCapability("deviceName","C707A1ZH76160136");
		capablities.setCapability("platformVersion","7.0");
		capablities.setCapability("pl0atformName","Android");
		// Mofirst Launcher
		capablities.setCapability("appPackage","com.android.dialer");
		capablities.setCapability("appActivity","com.android.dialer.DialtactsActivity");
		// For MI Launcher
		//capablities.setCapability("appPackage","com.miui.home");
		//capablities.setCapability("appActivity","com.miui.home.launcher.Launcher");
		
		dr= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capablities);

	}
	

}
