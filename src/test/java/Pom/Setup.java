package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Setup 
{
	public static  AndroidDriver<WebElement> driver;
	
	@BeforeTest(alwaysRun = true)
	public static void setCapabilities()
	{
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability("deviceName","OnePlus 6T");
		dc.setCapability("platformName", "Android");
		dc.setCapability("automation_Name", "UiAutomator2");
		dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		
		
		driver=new AndroidDriver<>(dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
