package com.gopashop.or;

import org.openqa.selenium.By;

public class LoginPage {

	public static By txtEmail = By.xpath("(//input[@id='email_address'])[1]");
	public static By btnSubmit = By
			.xpath("(//*[@id=\'root\']/div/div[2]/div/div[3]/div/div/div/form[2]/div[2]/button)");
	public static By txtPassword = By.xpath("//*[@id=\'password\']");
	public static By btnSignin = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/div/form[1]/div[3]/button");

}
