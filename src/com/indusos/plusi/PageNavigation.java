package com.indusos.plusi;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageNavigation 
  {
	// Scroll up the page 
	
    public void Scrolluppage(AndroidDriver<MobileElement>dr) throws InterruptedException
	     {
    		 Thread.sleep(5000);
    		 dr.swipe(400,1270,400,100,100);
		 
   	      }
	
	// Scroll down the page 
    public void Scrolldownpage(AndroidDriver<MobileElement>dr) throws InterruptedException
        {
    	  Thread.sleep(5000);
		  dr.swipe(432,390,317,1016,200);
		   
	     }
	
    // Swipe Left 

     public boolean Scrollleft(AndroidDriver<MobileElement> dr)
       {
	   dr.swipe(578, 470, 580, 1765,500);
	    return false;
       }


     // Swipe right 
    public boolean Scrollright(AndroidDriver<MobileElement> dr)
    {	
		dr.swipe(578, 470, 580, 1765,500);
		return false;
    }

	

	//Close the page 
	
	// Refresh the page 
	
	// click on back button 
	

}
