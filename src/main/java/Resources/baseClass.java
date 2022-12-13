package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseClass {

	public WebDriver driver;
	
	
	public void browserIntialization() throws IOException {

		// To read the properties file-
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		// To access the proprtes file
		Properties prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");

			 driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			// firefox code

		} else {

			System.out.println("please enter valid browser name");
		}

	}

	//dd
	@BeforeMethod
	public void launch() throws IOException {

		
		browserIntialization();
		driver.get("https://login.salesforce.com/");		
		
	}

}
