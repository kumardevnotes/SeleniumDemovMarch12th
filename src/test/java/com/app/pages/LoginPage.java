package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;
	public static By emailAddressField = By.id("email_input");
	public static By pwdField = By.id("password_input");
	public static By loginButton = By.id("login_button");
	public static By loggedInUserLabel = By.xpath("//li[@id='nav_user']/a");
	
	
	public LoginPage(WebDriver driverActual){
		this.driver = driverActual;
	}

	/** 
	This will take 2 String parameters. One for User email and one for password
	And returns a String
	*/
	public String loginIntoApp(String userEmail, String password) throws InterruptedException {
		driver.findElement(emailAddressField).sendKeys(userEmail);
		driver.findElement(pwdField).sendKeys(password);
		driver.findElement(loginButton).click();
		Thread.sleep(5000);
		return driver.findElement(loggedInUserLabel).getText();
	}

}
