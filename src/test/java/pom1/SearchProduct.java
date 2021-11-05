package pom1;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchProduct
{
    AndroidDriver<WebElement> app;
    @FindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
    public static WebElement searchBox;

    @FindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
    public static WebElement searched;


    @FindBy(xpath = "(//*[@text='samsung galaxy f12 mobile'])[1]")
    public  static WebElement clickSearchItem;

    public SearchProduct(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public  void  setSearchBox()
    {
       // app.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SearchProduct.searchBox.click();


        SearchProduct.searched.sendKeys("samsung galaxy f12 mobile");

        Assert.assertEquals(true,SearchProduct.clickSearchItem.isEnabled());

        SearchProduct.clickSearchItem.click();
    }
}
