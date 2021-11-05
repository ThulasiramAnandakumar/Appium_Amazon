package Amazon;

import Pom.SearchProducts;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom1.SearchProduct;
import pom1.SetUpFile;
import pom1.Signin;

public class Amazon1
{


    AndroidDriver<WebElement> app;

    @Test(priority = 1)
    public void setup()
    {
        SetUpFile sp=new SetUpFile();
        sp.setupAndroid();
    }

    @Test(priority = 2)
    public void signIn()
    {
        Signin si=new Signin(SetUpFile.app);
        si.sign(app);
    }

    @Test(priority = 3)
    public void searchProducts()
    {
        SearchProduct sp=new SearchProduct(SetUpFile.app);
        sp.setSearchBox();
    }
}
