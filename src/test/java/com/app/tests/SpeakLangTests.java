package com.app.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class SpeakLangTests {
	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.out.println("Launching application");
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		Thread.sleep(2000);
	}

	@Test
	public void verifySingup() {
		System.out.println("verifySingup is success");
	}
	
	@Test
	public void verifyLogin() {
		System.out.println("verifyLogin is success");
	}
	
	@Test
	public void verifyHomepage() {
		System.out.println("verifyHomepage is success");
	}
	
	@Test 
	public void verifyFooterSection() {
		System.out.println("verifyFooterSection is success");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
