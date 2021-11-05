package Amazon;

import Pom.*;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class Amazon extends Setup
{
	AndroidDriver<WebElement> app;


	@Test(priority = 1)
	void homepage()
	{
		Homepage hp=new Homepage(Setup.driver);
		hp.clickContinue();
	}

	@Test(priority = 2,description = "SearchProducts")
	void search() throws IOException
	{
		SearchProducts sp=new SearchProducts(Setup.driver);
		sp.search();
	}

	@Test(priority = 3)
	void select()
	{
		SelectProducts spm=new SelectProducts(Setup.driver);
		spm.selectItem();
	}

}
