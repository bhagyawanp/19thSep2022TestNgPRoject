package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LognInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;

public class signupTestCase extends baseClass {

	@Test
	public void verifySignup() throws IOException, InterruptedException {
		
		LognInPageObjects LPO=new LognInPageObjects(driver);
		LPO.clickOnTryForFree().click();
		
		SignUpPageObjects SPO=new SignUpPageObjects(driver);
		
		Thread.sleep(5000);
		SPO.enterFirstname().sendKeys(constant.firstname);
		
		
		commonMethods.selectDropdown(SPO.selectCompanyEmployees(), 1);
		
		commonMethods.selectDropdown(SPO.selectCountry(), 1);
		

	}

}
