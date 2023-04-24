package com.testng.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumDemoJSE {

	@Test
	public void verifyAppLaunch() throws Exception {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor jsObject = (JavascriptExecutor) driver;
		jsObject.executeScript("window.scrollBy(0,250)", "");
		
		//Scroll to the element
		WebElement langDD = driver.findElement(By.id("language_menu"));
		//NoSuchElementException is thrown if you try to locate an element which is not there in DOM/WebPage
		//InvalidSelectorException if you write incorrect xpath expression
		//StaleElementRefereceException
		jsObject.executeScript("arguments[0].scrollIntoView();", langDD);
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(langDD).build().perform();
		Thread.sleep(2000);
		
		/* :: Drag and Drop using Actions class in Selenium ::
		WebElement src = driver.findElement(By.id("src"));	
		WebElement target = driver.findElement(By.id("target"));
		action.dragAndDrop(src, target).build().perform();
		*/
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		Alert alertWindow = driver.switchTo().alert();
		//NoSuchAlertFoundException is thrown if you try to accpet() without opening alert window
		String textOnAlertWindow  = alertWindow.getText();
		System.out.println("textOnAlertWindow: "+textOnAlertWindow);
		alertWindow.accept();  // --> To click on Ok/Accept button on the alert window
		//alertWindow.dismiss(); --> To click on Cancel button on the alert window
		Thread.sleep(2000);
		
		driver.quit();
	}

}
