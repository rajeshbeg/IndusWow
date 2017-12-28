package com.indusos.plusi;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Wowmain {
	AndroidDriver<MobileElement> dr;
	WowCode wc= new WowCode();
	
	
	@BeforeTest
	public void setValue() throws MalformedURLException{
		
		DesiredCapabilities capablities = new DesiredCapabilities();
		 
		capablities.setCapability("deviceName","Redmi Note 4");
		capablities.setCapability("platformVersion","5.1");
		capablities.setCapability("platformName","Android");
		// Mofirst Launcher
		capablities.setCapability("appPackage","com.mofirst.launcher");
		capablities.setCapability("appActivity","com.mofirst.launcher.Launcher");
		// For MI Launcher
		//capablities.setCapability("appPackage","com.miui.home");
		//capablities.setCapability("appActivity","com.miui.home.launcher.Launcher");
		
		dr= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capablities);

	}
	
	// Wow launch Test
//	@Test(priority=10)
//	public void LaunchWow(){
//		
//		wc.Launchwow(dr);
		
	//}
	// Wow Scroll Test
	@Test(priority=1)
	public void ScrollTest() throws InterruptedException
	{
	
		dr.startActivity("com.indusos.plusi", "com.indusos.plusi.ui.WowHomepage");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		//System.out.println("Window's heght: "+dr.manage().window().getSize().getHeight());
		//wc.ScrollPage(dr);
	    
	
		
		List<MobileElement> x = dr.findElements(By.xpath("//android.widget.TextView"));
		System.out.println("number of element"+x.size());
		
		for(MobileElement y : x){
			if (y.equals("2")){
				y.click();
				}
			
			System.out.println("Count: "+y.getAttribute("text"));
			Thread.sleep(3000);
			dr.navigate().back();
		}
			
		}
		
}
	//	dr.findElements(By.xpath("//android.widget.TextView[@clickable='true'][3]"));
		// Scroll up the page

		// Scroll down the page  
    
		
		
	


