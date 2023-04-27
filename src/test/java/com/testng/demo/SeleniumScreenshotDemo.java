package com.testng.demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class SeleniumScreenshotDemo {

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
		
		//Call getScreenshotAs method to create image file
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Move image file to new destination
		File destFile=new File(rootFolder + "//Screenshots//myImage.png");
		
		//Copy file at destination
		FileHandler.copy(srcFile, destFile);
		
		driver.quit();
	}

}
