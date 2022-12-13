package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

	public WebDriver driver;

	By FirstName = By.xpath("//input[@name='UserFirstName']");

	By selectJobTitle = By.xpath("//select[@name='CompanyEmployees']");
	
	By countryName=By.xpath("//select[@name='CompanyCountry']");

	public SignUpPageObjects(WebDriver driver2) {

		this.driver=driver2;
	}

	public WebElement enterFirstname() {

		return driver.findElement(FirstName);
	}
	public WebElement selectCompanyEmployees() {

		return driver.findElement(selectJobTitle);
	}
	//ff
	
	public WebElement selectCountry() {

		return driver.findElement(countryName);
	}

}
