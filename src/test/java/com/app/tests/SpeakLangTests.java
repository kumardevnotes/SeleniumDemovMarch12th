package com.app.tests;

import org.testng.annotations.Test;

import com.app.pages.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SpeakLangTests {

	LandingPage landingPage = null;
	LoginPage loginPage = null;
	SignupPage signUpPage = null;
	HomePage homePage = null;
	FooterSectionPage footerSectionPage = null;
	String rootFolder = "";

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.out.println("Launching application");
		rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		landingPage = new LandingPage(driver);
		loginPage = new LoginPage(driver);
		signUpPage = new SignupPage(driver);
		homePage = new HomePage(driver);
		footerSectionPage = new FooterSectionPage(driver);

		driver.get("https://www.speaklanguages.com");
		Thread.sleep(2000);
	}

	@Test (enabled = false)
	public void verifySingup() throws InterruptedException, IOException {
		// Launching signup page from landing page
		landingPage.launchSignupPage();

		String signUpSuccessMessageExpected = "Thank you — now activate your account!";
		// Calling signUpAsNewUser() to fill all the details and click on signUP. Then
		// capture message and return it
		String signUpSuccessMessageActual = signUpPage.signUpAsNewUser();

		// Assertion with Assert class of TestNG
		// Assert.assertEquals(signUpSuccessMessageActual, signUpSuccessMessageExpected,
		// "Signup is not success");

		if (signUpSuccessMessageActual.equals(signUpSuccessMessageExpected)) {
			System.out.println("Signup is success :) ");
		} else {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File(rootFolder + "//Screenshots//verifySingupFailure.png");
			FileHandler.copy(srcFile, destFile);
			Assert.fail("Signup is not success");
		}

	}

	@Parameters({ "username", "useremail", "userpassword" })
	@Test(enabled = false)
	public void verifyLogin(String username, String useremail, String userpassword) throws InterruptedException, IOException {
		// Launching login page from landing page
		landingPage.launchLoginPage();
		String userNameExpected = username;
		String userNameActual  = loginPage.loginIntoApp(useremail, userpassword);
		if (userNameActual.equals(userNameExpected)) {
			System.out.println("Login is success :) ");
		} else {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File(rootFolder + "//Screenshots//verifyLoginFailure.png");
			FileHandler.copy(srcFile, destFile);
			Assert.fail("Login is not success");
		}
	}

	@Test(enabled = true)
	public void verifyHomepage() {
		System.out.println("verifyHomepage is success");
	}

	@Test(enabled = false)
	public void verifyFooterSection() {
		System.out.println("verifyFooterSection is success");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
