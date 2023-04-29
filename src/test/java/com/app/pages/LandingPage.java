package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver = null;
	public static By loginLink = By.xpath("//a[.='Log in']");
	public static By signUpLink = By.xpath("//a[.='Sign up']");
	public static By footerElement = By.id("language_menu");
	
	public LandingPage(WebDriver driverActual){
		this.driver = driverActual;
	}

	public void launchLoginPage() {
		driver.findElement(loginLink).click();
	}

	public void launchSignupPage() {
		driver.findElement(signUpLink).click();
	}

	public void scrollToFooterPage() throws InterruptedException {
		JavascriptExecutor jsObject = (JavascriptExecutor) driver;
		WebElement langDD = driver.findElement(footerElement);
		jsObject.executeScript("arguments[0].scrollIntoView();", langDD);
		Thread.sleep(2000);
	}

}
