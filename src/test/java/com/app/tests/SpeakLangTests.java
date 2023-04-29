package com.app.tests;

import org.testng.annotations.Test;

import com.app.pages.*;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SpeakLangTests {
	
	LandingPage landingPage = null;
	LoginPage loginPage = null;
	SignupPage signUpPage = null;
	HomePage homePage = null;
	FooterSectionPage footerSectionPage = null;
	
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
		
		landingPage  = new LandingPage(driver);
		loginPage  = new LoginPage(driver);
		signUpPage  = new SignupPage(driver);
		homePage  = new HomePage(driver);
		footerSectionPage  = new FooterSectionPage(driver);
		
		driver.get("https://www.speaklanguages.com");
		Thread.sleep(2000);
	}

	@Test
	public void verifySingup() throws InterruptedException {
		landingPage.launchSignupPage();
		String signSuccessMessageExpected = "Thank you — now activate your account";
		String signUpSuccessMessageActual  = signUpPage.signUpAsNewUser();
		System.out.println("signUpSuccessMessage: "+signUpSuccessMessageActual);
		Assert.assertEquals(signUpSuccessMessageActual, signSuccessMessageExpected, "Signup is not success");
		System.out.println("Signup is success :) ");
	}
	
	@Test  (enabled  =  false)
	public void verifyLogin() {
		System.out.println("verifyLogin is success");
	}
	
	@Test (enabled  =  false)
	public void verifyHomepage() {
		System.out.println("verifyHomepage is success");
	}
	
	@Test   (enabled  =  false)
	public void verifyFooterSection() {
		System.out.println("verifyFooterSection is success");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
