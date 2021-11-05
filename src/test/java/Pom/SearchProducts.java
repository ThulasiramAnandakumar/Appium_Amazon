package Pom;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class SearchProducts
{
    AndroidDriver<WebElement> app;
    @AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/rs_search_src_text")
    public static WebElement clickSearchBox;
    @AndroidFindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
    public static WebElement searched;
    @AndroidFindBy(xpath = "(//*[@text='iphone 13 mini 128'])[3]")
    public  static WebElement clickSearchItem;

    @AndroidFindBy(xpath = "//*[@text='iphone 13 mini 128 gb']")
    public  static  WebElement dropdown;

    @AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/iss_search_dropdown_item_clear")
    public  static  WebElement closeDropdownElements;


    public SearchProducts(AndroidDriver<WebElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void search() throws IOException
    {
        Generic g=new Generic();


       Properties p=g.propertyFile();
       String productName= (String) p.get("searchProduct");
       int time= Integer.parseInt((String) p.get("timeOut"));


      g.explicitWait(ExpectedConditions.visibilityOf(SearchProducts.clickSearchBox),time);
        Assert.assertEquals(true,SearchProducts.clickSearchBox.isDisplayed());
        SearchProducts.clickSearchBox.click();


        if(SearchProducts.dropdown.isDisplayed())
        {
            SearchProducts.dropdown.click();
        }
    else {
            g.explicitWait(ExpectedConditions.visibilityOf(SearchProducts.searched), time);
            SearchProducts.searched.sendKeys(productName);
            g.explicitWait(ExpectedConditions.visibilityOf(SearchProducts.clickSearchItem), time);
            SearchProducts.clickSearchItem.click();

        }


    }
}
