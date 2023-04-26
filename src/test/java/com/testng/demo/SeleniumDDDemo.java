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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumDDDemo {

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
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebElement ddElement = driver.findElement(By.name("sex"));
		Select genderDD = new Select(ddElement);
		genderDD.selectByIndex(2);
		Thread.sleep(2000);
		genderDD.selectByIndex(1);
		Thread.sleep(2000);
		genderDD.selectByVisibleText("Female");
		Thread.sleep(2000);
		genderDD.selectByValue("Male");
		Thread.sleep(5000);
		driver.quit();
	}

}
