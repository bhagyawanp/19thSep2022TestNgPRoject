package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LognInPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;

public class LoginTestCase extends baseClass{
	
	@Test
	public void login() throws IOException {
	
		LognInPageObjects LPO=new LognInPageObjects(driver);
		
		LPO.enterUsername().sendKeys(constant.username);
		LPO.enterPassword().sendKeys(constant.password);
		LPO.clickOnLogin().click();
	
		commonMethods.handleAssertion(LPO.erroMessage().getText(), constant.erroMessage);

			
	}

}
