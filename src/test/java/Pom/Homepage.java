package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class Homepage 
{


	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/sso_continue")
	public  WebElement clickToContinue;


	public Homepage(AndroidDriver<WebElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);

	}
	



	public void clickContinue() 
	{
		clickToContinue.click();
	}
}
