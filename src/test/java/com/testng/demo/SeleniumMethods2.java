package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumMethods2 {

	@Test
	public void verifyAppLaunch() throws Exception {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		Thread.sleep(2000);
		
		String capturedText = driver.findElement(By.xpath("//li[@id='nav_login']/a")).getText();
		System.out.println("getText()-->" + capturedText);
		
		String capturedAttrValue = driver.findElement(By.xpath("//li[@id='nav_login']/a")).getAttribute("href");
		System.out.println("getAttribute()-->" + capturedAttrValue);
		
		String capturedTitle = driver.getTitle();
		System.out.println("getTitle()-->" + capturedTitle);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("getCurrentUrl()-->" + currentUrl);
		
		//String pageSource = driver.getPageSource();
		//System.out.println("getPageSource()-->" + pageSource);
		
		driver.quit();
	}

}
