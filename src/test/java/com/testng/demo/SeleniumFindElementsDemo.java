package com.testng.demo;

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

public class SeleniumFindElementsDemo {

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
		
		String parentWindow = driver.getWindowHandle();
		
		List<WebElement> langWebElements  = driver.findElements(By.xpath("//p[@class='site_link']/a"));
		
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
		
		driver.quit();
	}

}
