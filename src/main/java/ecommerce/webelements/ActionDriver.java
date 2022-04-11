package ecommerce.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import ecommerce.config.StartBrowser;

public class ActionDriver {

	public WebDriver driver;

	public ActionDriver() {

		driver = StartBrowser.driver;

	}

	public void navigateToApplication(String url) {

		try {

			driver.get(url);
			StartBrowser.childTest.pass("Successfully Navigate To : " + url);

		}

		catch (Exception e) {

			StartBrowser.childTest.fail("Unable to Navigate to : " + url);

		}

	}

	public void click(By locator, String eleName) throws Exception {

		try {
			driver.findElement(locator).click();
			StartBrowser.childTest.pass("Performed click action on : " + eleName);
		}

		catch (Exception e) {

			StartBrowser.childTest.fail("Unable to performed click on : " + eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;

		}

	}

	public void type(By locator, String testData, String eleName) {

		try {

			driver.findElement(locator).sendKeys(testData);
			StartBrowser.childTest
					.pass("Successfully performed type action on :" + eleName + " with test data : " + testData);

		}

		catch (Exception e)

		{

			StartBrowser.childTest.fail("Unable to performed click on : " + eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;

		}

	}

	public String screenShot() {

		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

	}

}
