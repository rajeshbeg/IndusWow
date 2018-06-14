package APITest;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.indusos.plusi.PageNavigation;
import com.indusos.plusi.WowCode;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class AppiumUitest {
	private AndroidDriver<MobileElement> dr;
	WowCode wc= new WowCode();
	PageNavigation pn= new PageNavigation();
	 
	
  @BeforeTest
	public void setValue() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities capablities = new DesiredCapabilities();
		 
		capablities.setCapability("deviceName","WCYDCUJ7ZTRGMNWO");
		capablities.setCapability("platformVersion","6.0");
		capablities.setCapability("platformName","Android");
		// Mofirst Launcher
		capablities.setCapability("appPackage","io.appium.android.apis");
		capablities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		// For MI Launcher
		//capablities.setCapability("appPackage","com.miui.home");
		//capablities.setCapability("appActivity","com.miui.home.launcher.Launcher");
		
		dr= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capablities);
		dr.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

  }
  
  @Test(priority=1, enabled=false)
  public void test1() throws InterruptedException{
	  System.out.println(dr.getContext());
		 System.out.println(dr.currentActivity());

	  
	  // find the element with Xpath
	  dr.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	  //find the another inner option Preferences dependencies 
		  
	  dr.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	  // now find the element with resource id and checked the box
	  
	 // Check either the checked box is enabled or not 
	  
	 if (!dr.findElementById("android:id/checkbox").isSelected()){
		 dr.findElementById("android:id/checkbox").click();
	 }
	 
	 
	  // when we dont have id and text the click by index 
	  assertFalse((dr.findElementById("android:id/checkbox").isSelected()));
	 Thread.sleep(2000);
	 dr.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
	 
	 // Find element By Class Name
	 dr.findElementByXPath("//android.widget.EditText").sendKeys("Hello");
	 
	
  }
  @Test(priority=2, enabled=false)
  public void test2(){
	  // find Element by AndroidAutomator viewer 
	  
	 dr.findElementByAndroidUIAutomator("text(\"App\")").click();
  }
  
  
  @Test(priority=3,enabled=false)
  public void test3(){
	  // guester test 
	  TouchAction ta = new TouchAction(dr);
	  ta.tap( dr.findElementByAndroidUIAutomator("text(\"App\")")).perform() ;
	  }
  @Test(priority=4,enabled=false)
  // Scrooll The page
  public void test4() throws InterruptedException{
	 
	  // Gesture test ,use Press element 
	  
	  dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
  }
  @Test(priority=4, enabled=false)
  // Swiping by using TouchAction
  public void test5() throws InterruptedException{
	  TouchAction ta = new TouchAction(dr);
	  // Gesture test ,use Press element 
	  
	  dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
	  // click on Data Widget
	  dr.findElementByXPath("//android.widget.TextView[@content-desc='Date Widgets']").click();
	  // click on inline 
	  dr.findElementByXPath("//android.widget.TextView[@content-desc='2. Inline']").click();
     // click on first element
	  Thread.sleep(2000);
	  dr.findElementByXPath("//*[@content-desc='9']").click();
	  Thread.sleep(3000);
	 ta.press(dr.findElementByXPath("//*[@content-desc='15']")).waitAction(2000).moveTo(dr.findElementByXPath("//*[@content-desc='45']")).release().perform();	
  }
  @Test(priority=5 , enabled=false)
  public void Test6() throws InterruptedException{
	  TouchAction ta = new TouchAction(dr);
	  // click on data widget
	  dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
	// click on Drag And Drop 
	  dr.findElementByXPath("//android.widget.TextView[@content-desc='Drag and Drop']").click();
	  // Drag and drop aps 
	  Thread.sleep(2000);
    ta.longPress(dr.findElementsByClassName("android.view.View").get(0)).moveTo(dr.findElementsByClassName("android.view.View").get(2)).release().perform();
  }
  @Test(priority=6,enabled=false)
  public void test7(){
	  // some example of Press Keycode 
	  
	  dr.pressKeyCode(AndroidKeyCode.HOME);
	  dr.pressKeyCode(AndroidKeyCode.BACK);
	  dr.pressKeyCode(AndroidKeyCode.DEL);
	  
  }
  
}