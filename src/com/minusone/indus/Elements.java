package com.minusone.indus;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Elements {
	AndroidDriver<MobileElement> dr;
	
	public Elements(AndroidDriver<MobileElement>dr){
		
		this.dr=dr;
		
		
	}
}
