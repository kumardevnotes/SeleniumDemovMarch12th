package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumMethods1 {

	@Test
	public void verifyAppLaunch() throws Exception {
		System.out.println("Launching App");

		// to get rootfolder path
		String rootFolder = System.getProperty("user.dir");

		// to set the location path for driver file
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");

		// To launch browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // ChromeDriver implements WebDriver - 10+20 -->30

		// to maximize browser
		driver.manage().window().maximize();

		// to launch application in browser which is opened above
		driver.get("https://speaklanguages.com");
		Thread.sleep(2000);

		//Captures first window ID
		String parentWindow = driver.getWindowHandle();

		//launching new tab to launch facebook
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Dimension dimension = new Dimension(400, 400);
		driver.manage().window().setSize(dimension);
		
		driver.get("https://facebook.com");
		Thread.sleep(3000);

		// It closes only the current tab or current winow
		//driver.close();

		// control comes to the original or parent window
		driver.switchTo().window(parentWindow);
		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(4000);
//		
//		driver.navigate().refresh();
//		
//		// to wait for 3 seconds
//		Thread.sleep(4000); // 3000ms == 3sec

		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("email_input")).sendKeys("johnnitesh2@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("Testing@123");
		driver.findElement(By.id("login_button")).click();

		Thread.sleep(4000);

		// It closes all the browser tabs or windows
		driver.quit();

		System.out.println("App luanhced successfully and closed browser");
	}

}
