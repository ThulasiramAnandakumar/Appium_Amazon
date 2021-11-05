package pom1;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class SetUpFile
{
    public static AndroidDriver<WebElement> app;
    public  void setupAndroid()
    {
        DesiredCapabilities dc=new DesiredCapabilities();

        dc.setCapability("deviceName","OnePlus 6T");
        dc.setCapability("platformName", "Android");
        dc.setCapability("automation_Name", "UiAutomator2");
        dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
        dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");


        app=new AndroidDriver<WebElement>(dc);
        app.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
