package com.jomashop.reuse;

import org.openqa.selenium.WebDriver;

import com.gopashop.or.HomePage;
import com.gopashop.or.LoginPage;

import ecommerce.config.StartBrowser;
import ecommerce.webelements.ActionDriver;

public class CommonFunction {

	public ActionDriver aDriver;
	public WebDriver driver;

	public CommonFunction() {

		aDriver = new ActionDriver();
		driver = StartBrowser.driver;

	}

	public void login() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login To Application ");
		aDriver.navigateToApplication("https://www.jomashop.com/");
		aDriver.click(HomePage.LinkMyAccount, "My Account link ");
		aDriver.type(LoginPage.txtEmail, "iftlasker@gmail.com", "Email Textbox");
		aDriver.click(LoginPage.btnSubmit, "Email Submit Button");
		aDriver.type(LoginPage.txtPassword, "Test1234@", "Password TextBox");
		aDriver.click(LoginPage.btnSignin, "SignIn button");

	}

}
