package com.string.javadatatypes.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumWindowHandlingDemo {

	@Test
	public void verifyAppLaunch() throws Exception {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		Thread.sleep(2000);
		String firstWindowId = driver.getWindowHandle();
		System.out.println(firstWindowId);

		// It will launch a new tab in existing chrome window and switch to it
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		String secondWindowId = driver.getWindowHandle();
		System.out.println(secondWindowId);
		// It closes current tab or window
		// driver.close();

//		driver.switchTo().window(firstWindowId);
//
//		Thread.sleep(2000);
//		driver.switchTo().window(secondWindowId);
//		Thread.sleep(2000);
//		driver.switchTo().window(firstWindowId);

		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains("Speak Languages")) {
				System.out.println("I am in Speak Lanaguages app now");
			} else if (driver.getTitle().contains("Rediffmail")) {
				System.out.println("I am in Rediff email app now");
			} else {
				System.out.println("I am not into any app as of now");
			}
			Thread.sleep(2000);
		}

		// It closes all the opened tabs or windows
		driver.quit();
		
		Thread.sleep(5000);

		//Launching chrome again as a fresh window
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		
		String parentWindow = driver.getWindowHandle();
		
		List<WebElement> langWebElements  = driver.findElements(By.xpath("//p[@class='site_link']"));
		
		List<String> langUrls = new ArrayList<String>();
		
		for(WebElement element  : langWebElements) {
			String langUrl =element.getAttribute("href");
			langUrls.add(langUrl);
		}
		
		for(String url  : langUrls) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(url);
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(parentWindow);
		}
		
	}

}
