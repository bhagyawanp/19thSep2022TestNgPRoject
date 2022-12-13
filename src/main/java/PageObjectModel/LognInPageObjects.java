package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LognInPageObjects {
	
	//This is demo line for github

	public WebDriver driver; // This driver dont have scope

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	
	By errorMessage=By.xpath("//div[@id='error']");
	

	public LognInPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
		
	}

	public WebElement enterUsername() {

		return driver.findElement(username);

		// driver.findelkement(By.xpath("//input[@id='username']");
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	public WebElement clickOnTryForFree() {
		return driver.findElement(tryForFree);
	}
	
	public WebElement erroMessage() {
		return driver.findElement(errorMessage);
	}


}
