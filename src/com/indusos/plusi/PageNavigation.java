package com.indusos.plusi;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageNavigation 
  {
	// Scroll up the page 
	
    public void Scrolluppage(AndroidDriver<MobileElement>dr) throws InterruptedException
	     {
    		 Thread.sleep(5000);
    		 dr.swipe(377,1180,339,65,2000);
		 
   	      }
	
	// Scroll down the page 
    public void Scrolldownpage(AndroidDriver<MobileElement>dr) throws InterruptedException
        {
    	  Thread.sleep(5000);
		  dr.swipe(339,65,377,1180,2000);
		   
	     }
	
    // Swipe Left 

     public boolean Scrollleft(AndroidDriver<MobileElement> dr)
       {
	   dr.swipe( 554,655, 156, 607,500);
	    return true;
       }


     // Swipe right 
    public boolean Scrollright(AndroidDriver<MobileElement> dr)
    {	
		dr.swipe(156, 607, 554, 655,500);
		return false;
    }

	

	//Close the page 
	
	// Refresh the page 
	
	// click on back button 
	

}
