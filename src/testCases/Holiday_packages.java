package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import page_Objects.Login_Page_Objects;
public class Holiday_packages extends CommonFunctions    {
	@Test
	public void verify_TheVisa_Free_Country() {
		
		PageFactory.initElements(driver,Login_Page_Objects.class);
		Login_Page_Objects.loginOrCreate.click();
		Login_Page_Objects.Ads.click();
		Login_Page_Objects.username.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.continuebutton.click();
		Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.loginbutton.click();
		
	}
	

}
