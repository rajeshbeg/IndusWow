package com.indusos.plusi;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Wowmain {
	AndroidDriver<MobileElement> dr;
	WowCode wc= new WowCode();
	PageNavigation pn= new PageNavigation();
	
  @BeforeTest
	public void setValue() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities capablities = new DesiredCapabilities();
		 
		capablities.setCapability("deviceName","WCYDCUJ7ZTRGMNWO");
		capablities.setCapability("platformVersion","6.0");
		capablities.setCapability("platformName","Android");
		// Mofirst Launcher
		capablities.setCapability("appPackage","com.android.vending");
		capablities.setCapability("appActivity","com.android.vending.AssetBrowserActivity");
		// For MI Launcher
		//capablities.setCapability("appPackage","com.miui.home");
		//capablities.setCapability("appActivity","com.miui.home.launcher.Launcher");
		
		dr= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capablities);
		dr.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		dr.navigate().back();
		Thread.sleep(2000);
		pn.Scrollright(dr);


	}
	
	// Wow launch Test
//	@Test(priority=10)
//	public void LaunchWow(){
//		
//		wc.Launchwow(dr);
		
	//}
	// Wow Scroll Test
	@Test(priority=1, enabled=true)
	public void SwipeTest1() throws InterruptedException
	{
	int count=0;
	Thread.sleep(4000);
	// right Swipe the page 
	for (int i=0;i<20;i++){
		count++;
	pn.Scrollright(dr);
	Thread.sleep(5000);
	
	
	//scroll left 
	pn.Scrollleft(dr);
	Thread.sleep(5000);
	
	// click on Element 
//	TouchAction t= new TouchAction(dr);
//	pn.Scrolluppage(dr);

//	List<MobileElement> calcButtons = dr.findElements(By.xpath("//android.widget.LinearLayout"));
//	System.out.println(calcButtons.get(13).getText());
//	
	
//	//dr.findElementByXPath("(//android.widget.LinearLayout)[9]").click();
//	if (dr.findElementByXPath("\\android.widget.LinearLayout[@index='15']/android.widget.TextView[@text='UC Browser']").isDisplayed()){
//	t.tap(dr.findElementByXPath("\\android.widget.LinearLayout[@index='15']/android.widget.TextView[@text='UC Browser']")).perform();
//	}else{
//	// Scroll up 
//	pn.Scrolluppage(dr);
//}
//	
	
//	dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aliens Attack\"));").click();
//	dr.findElementByXPath("\\android.widget.LinearLayout[@index='12']/andrandroid.widget.LinearLayout[@text='Live.me']").click();
	
	// scroll left
//	pn.Scrollleft(dr);
//	 Thread.sleep(2000);
	
	}System.out.println(count);
	}
	
	@Test(priority=2,enabled = false)
	public void ScrollTest2() throws InterruptedException{
		
		pn.Scrollright(dr);
		
		for (int i=0;i<=10;i++){
	 // scroll up the page 
		pn.Scrolluppage(dr);
		// scroll down the page
		pn.Scrolldownpage(dr);
		
		
	}
	}
	
	//select Elements 
//	List<MobileElement> LinearElemnets = dr.findElements(By.className("android.widget.LinearLayout"));
//	LinearElemnets.get(6).click();
	@Test(priority=3,enabled=false)
	public void clickTestGame() throws InterruptedException{
		for(int i=0;i<4;i++){
		// click on Wow news and click on back button 
		pn.Scrolluppage(dr);
		// click on App Suggestion
		dr.findElement(By.xpath("//android.widget.TextView[@text='APUS']")).click();
		
		((AndroidDriver)dr).pressKeyCode(AndroidKeyCode.HOME);
		 Thread.sleep(2000);
		pn.Scrollright(dr);
		// Click on App Game 
		 Thread.sleep(2000);
		dr.findElement(By.xpath("//android.widget.TextView[@text='2048']")).click();
	
		dr.navigate().back();
		Thread.sleep(3000);
		dr.navigate().back();
		//click on Jokes option  
	    dr.findElement(By.xpath("//android.widget.TextView[@text='Jokes']")).click();
		dr.navigate().back();
		Thread.sleep(3000);
		dr.navigate().back();
		
		// scroll the page and click on shop and video
		 pn.Scrolluppage(dr);
		 dr.findElement(By.xpath("//android.widget.TextView[@text='Cabs']")).click();
		 Thread.sleep(3000);
		 dr.navigate().back();
	 
		 dr.findElement(By.xpath("//android.widget.TextView[@text='TV & Appliances']")).click();
		 Thread.sleep(3000);
		 dr.navigate().back();
		 pn.Scrolluppage(dr);
		 dr.findElement(By.xpath("//android.widget.TextView[@text='Mummy Papa Ka Second Honeymoon']")).click();
		 Thread.sleep(3000);
		
		 ((AndroidDriver)dr).pressKeyCode(AndroidKeyCode.HOME);
		 Thread.sleep(3000);
		 pn.Scrollright(dr);
		 for(int j=0;j<4;j++){
			 pn.Scrolldownpage(dr);
		 }
		}
		/*	
	 * 
		TouchAction ta = new TouchAction(dr);
		
		dr.findElement(By.xpath("//android.widget.TextView[@text='Blocking Bugs']")).clear();
//		ta.tap(389,1049).perform();
		dr.navigate().back();
		dr.navigate().back();
//		dr.findElement(By.xpath("//android.widget.TextView[@text='APUS']")).clear();
		dr.navigate().back();
		Thread.sleep(3000);
		dr.navigate().back();
		 pn.Scrolluppage(dr);
		dr.findElement(By.xpath("//android.widget.TextView[@text='Jokes']")).clear();
		dr.navigate().back();
		Thread.sleep(3000);
		dr.navigate().back();
		
		// scroll the page  click on App Suggestion
		
		// ta.tap(116, 591).perform();
		 dr.findElement(By.xpath("//android.widget.TextView[@text='Cabs']")).clear();
		 Thread.sleep(3000);
		 dr.navigate().back();
		
		 pn.Scrolluppage(dr);
		 
		 dr.findElement(By.xpath("//android.widget.TextView[@text='Women's western wear']")).clear();
		 Thread.sleep(3000);
		 dr.navigate().back();
		 
		 dr.findElement(By.xpath("//android.widget.TextView[@text='Mummy Papa Ka Second Honeymoon']")).clear();
		 Thread.sleep(10000);
		 dr.navigate().back();
		 // click on Game option
//		 ta.tap(123,682).perform();
//		 dr.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//		 dr.navigate().back();
//		 
		// Click on Entertainment 
		 
		 
		 
	*/	 
//	dr.findElementByXPath("//android.widget.TextView[@text='Yummy Taco']").click();
		
//	MobileElement parent=	dr.findElementById("com.indusos.minusone:id/scrollContainer");
		// click on Game 
		
// List <MobileElement> childs= parent.findElements(By.className("android.widget.ScrollView"));
// MobileElement mainElement = childs.get(13);
 
 
	
	
	
	// Click on Home button 
//	((AndroidDriver)dr).pressKeyCode(AndroidKeyCode.HOME);
	
	}
	
	@Test(enabled=false)
	public void  WowEvents() throws InterruptedException{
		 pn.Scrollright(dr);
		 Thread.sleep(8000);
		 TouchAction ta = new TouchAction(dr);
		// click on Just in News 
		ta.tap(358,962).perform();
		 Thread.sleep(8000);
//		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		dr.navigate().back();
//		// News Details
//		ta.tap(332,1098).perform();
//		Thread.sleep(4000);
//		dr.navigate().back();
		// scroll and click on Refresh 
		
		dr.swipe(362, 1159, 409, 711,2000);
		dr.findElement(By.xpath("//android.widget.TextView[@text='Refresh']")).click();
	    Thread.sleep(3000);
		// click on All News 
		
		dr.findElement(By.xpath("//android.widget.TextView[@text='All News']")).click();
		Thread.sleep(4000);
		pn.Scrolluppage(dr);
	
		Thread.sleep(2000);
		ta.tap(429,801).perform();
		Thread.sleep(3000);
        
//		
		dr.swipe(358,954,331,579,200);
//		// tap on TTs Button 
////		ta.tap(63,1049).perform();
//		Thread.sleep(5000);
		dr.findElement(By.xpath("//android.widget.TextView[@text='Read Full Story']")).click();
	}
	
	}
	
	
	
		
    
		
		
	


