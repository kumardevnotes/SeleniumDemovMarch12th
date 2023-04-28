package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;
	public static By emailAddressField = By.id("email_input");
	public static By pwdField = By.id("password_input");
	public static By loginButton = By.id("login_button");

	public void loginIntoApp(String userEmail, String password) {
		driver.findElement(emailAddressField).sendKeys(userEmail);
		driver.findElement(pwdField).sendKeys(password);
		driver.findElement(loginButton).click();
	}

}
