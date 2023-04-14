package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumDemo1 {

	@Test
	public void launchFacebook() throws Exception {
		System.out.println("Launching facebook");

		// to get rootfolder path
		String rootFolder = System.getProperty("user.dir");

		// to set the location path for driver file
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");

		//To launch browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // ChromeDriver implements WebDriver - 10+20 -->30

		// to maximize browser
		driver.manage().window().maximize();

		// to launch application in browser which is opened above
		driver.get("https://facebook.com");

		// to wait for 3 seconds
		Thread.sleep(3000); // 3000ms == 3sec

		// close the browser
		driver.close();

		System.out.println("Facebook luanhced successfully and closed browser");
	}

}
