package com.indusos.plusi;

import java.util.Set;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class WowCode 

// Test cases of IndusWow-Version - 1.04.00--------------Created By Rajesh Beg---------------
  {
	public boolean Launchwow(AndroidDriver<MobileElement>dr){
		// Launch the IndusWow for 5 times 
		for (int x=0;x<5;x++){
		try {
		dr.startActivity("com.indusos.plusi","com.indusos.plusi.ui.WowHomepage");
		
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Fail to start Activity");
		}
		}
		
		return false;
		
	}
	public boolean ScrollPage(AndroidDriver<MobileElement>dr) throws InterruptedException{
		// scroll the page and wit for news loading till end of the page 
		// scroll up the main page by 5 times and check
		System.out.println("I am here 1");
		dr.startActivity("com.indusos.plusi","com.indusos.plusi.ui.WowHomepage");
		// Make an object of Page Navigation 
		PageNavigation pg= new PageNavigation();
		
		pg.Scrolluppage(dr);
		
		Thread.sleep(3000);
		//Scroll down the page 
		for (int i=1;i<=3;i++){
			pg.Scrolldownpage(dr);
			
			}
		
		//Open More Option and Scroll the page 
		
	
	
	
		
		// 
		for (int i=1;i<=2;i++){
			pg.Scrolluppage(dr);
			
			}
		Thread.sleep(3000);
		for (int i=1;i<=2;i++){
			pg.Scrolluppage(dr);
			
			}
		
		
		return false;
		
	}
	//Open Just in Section And swipe the page Left and right 
	
	
	//Tap on More button and count the content and croll the page up and down
	

	//Remove and Add the widget multiple time 
	
	
	//Shift the wow to the next page 
	
	
	//
	
}
