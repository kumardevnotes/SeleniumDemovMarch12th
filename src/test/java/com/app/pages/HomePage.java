package com.app.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver =null;
	
	public HomePage(WebDriver driverActual){
		this.driver = driverActual;
	}


	public boolean isHomePageLoaded() {
		return false;
	}
}
