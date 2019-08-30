package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest()
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialize");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page");
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username, String password, String text) throws IOException {

		// to access the methods from another class we have two option 1. we can use
		// inheritance 2. create object of that class
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();

		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(password);
		System.out.println(text);
		log.info("text is printed");
		lp.getLogin().click();
	}

	@AfterTest()
	public void closeWindow() {
		driver.close();
		driver=null;
	}

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many data types test should run
		// coloumn stnds for how mny values for each test
		Object[][] data = new Object[2][3];
		data[0][0] = "abc@gmail.com";
		data[0][1] = "abcdefgh";
		data[0][2] = "aaaa";

		data[1][0] = "xyz@gmail.com";
		data[1][1] = "xyzqwerrr";
		data[1][2] = "sdsf";

		return data;
	}
}
