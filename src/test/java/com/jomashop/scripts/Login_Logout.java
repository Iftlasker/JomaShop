package com.jomashop.scripts;

import org.testng.annotations.Test;

import com.jomashop.reuse.CommonFunction;

import ecommerce.config.StartBrowser;

public class Login_Logout extends StartBrowser {
	@Test
	public void Login_LogoutTestCase() throws Exception {
		CommonFunction cfs = new CommonFunction();
		cfs.login();

	}
}
