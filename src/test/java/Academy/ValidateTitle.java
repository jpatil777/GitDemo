package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class ValidateTitle extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest()
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialize");

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {
		// to access the methods from another class we have two option 1. we can use
		// inheritance 2. create object of that class
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("successfully validated text message");
	}

	@AfterTest()
	public void closeWindow() {
		driver.close();
		driver = null;
	}
}
