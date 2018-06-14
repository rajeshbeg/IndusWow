package APITest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.indusos.plusi.PageNavigation;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Raaga {
	private  AndroidDriver<MobileElement> dr;
	PageNavigation pn= new PageNavigation();
	
  @BeforeTest
	public void setValue() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities capablities = new DesiredCapabilities();
		 
		capablities.setCapability("deviceName","WCYDCUJ7ZTRGMNWO");
		capablities.setCapability("platformVersion","6.0");
		capablities.setCapability("platformName","Android");
		
		capablities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		//Mofirst Launcher
//		capablities.setCapability("appPackage","");
//		capablities.setCapability("appActivity","");;
		// For MI Launcher
		//capablities.setCapability("appPackage","com.miui.home");
		//capablities.setCapability("appActivity","com.miui.home.launcher.Launcher");
		
		dr= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capablities);
		dr.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		
	}
   @Test(priority=1,enabled =true)
	public void test1() throws InterruptedException {
	// Open url
	   dr.get("http://www.facebook.com");
	  
	  // print the title
	   System.out.println("Title "+dr.getTitle());
	  
	 // enter username
	 dr.findElement(By.name("email")).sendKeys("mukesh@gmail.com");
	  
	 // enter password
	       dr.findElement(By.name("pass")).sendKeys("mukesh_selenium");
	  
	 // click on submit button
	 dr.findElement(By.id("u_0_5")).click();
	  
	 // close the browser
	 dr.quit();
}
}