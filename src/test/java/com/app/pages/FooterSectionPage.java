package com.app.pages;

import org.openqa.selenium.WebDriver;

public class FooterSectionPage {
	
	WebDriver driver = null;
	
	public FooterSectionPage(WebDriver driverActual){
		this.driver = driverActual;
	}

	public boolean isFooterSectionLoaded() {
		return false;
	}

}
