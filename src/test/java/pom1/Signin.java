package pom1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Signin
{
    @FindBy(id="in.amazon.mShop.android.shopping:id/sso_continue")
    public static WebElement clickContinue;

    public Signin(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void sign(AndroidDriver<WebElement> app)
    {

//        app.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(true,Signin.clickContinue.isDisplayed());
        Signin.clickContinue.click();
    }
}
