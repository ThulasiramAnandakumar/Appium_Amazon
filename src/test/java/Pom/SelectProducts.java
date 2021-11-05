package Pom;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectProducts
{
    @AndroidFindBy(xpath = "(//*[@text='Apple iPhone 13 Mini (256GB) - Midnight'])[1]")
    public  static WebElement selectProduct;

    public  SelectProducts(AndroidDriver<WebElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public  void selectItem()
    {
        Generic g=new Generic();
        g.explicitWait(ExpectedConditions.visibilityOf(SelectProducts.selectProduct),10);
        SelectProducts.selectProduct.click();

        g.scrollDown("Add to Cart");

    }

}
