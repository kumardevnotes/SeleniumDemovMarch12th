package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class SignupPage {
	
	WebDriver driver = null;
	public static By firstNameField = By.id("first_name");
	public static By lastNameField = By.name("last_name");
	public static By emailAddressField = By.name("email");
	public static By passwordField = By.name("password");
	public static By genderDD = By.name("sex");
	public static By dayDD = By.name("dob_day");
	public static By monthDD = By.name("dob_month");
	public static By yearDD = By.name("dob_year");
	public static By signUpButton = By.xpath("//input[@value='Sign up']");
	
	public static By thankYouLabel = By.xpath("//h1[contains(text(),'now activate your account')]");
	
	public String signUpAsNewUser() throws InterruptedException {
		
		Faker faker = new Faker();
		
		String firstName = faker.name().firstName();
		System.out.println(firstName);
		
		String lastName = faker.name().lastName();
		System.out.println(lastName);
		
		String emailAddressValue = faker.internet().emailAddress();
		System.out.println(emailAddressValue);
		
		driver.findElement(firstNameField).sendKeys(firstName);
		driver.findElement(lastNameField).sendKeys(lastName);
		driver.findElement(emailAddressField).sendKeys(emailAddressValue);
		driver.findElement(passwordField).sendKeys("Pwd112233");
		
		WebElement genderDDElement = driver.findElement(genderDD);
		Select genderDropDown = new Select(genderDDElement);
		genderDropDown.selectByVisibleText("Male");
		
		WebElement dayDDElement = driver.findElement(dayDD);
		Select dayDropdown = new Select(dayDDElement);
		dayDropdown.selectByVisibleText("1");
		
		WebElement monthDDElement = driver.findElement(monthDD);
		Select monthDropDown = new Select(monthDDElement);
		monthDropDown.selectByVisibleText("January");
		
		WebElement yearDDElement = driver.findElement(yearDD);
		Select yearDropDown = new Select(yearDDElement);
		yearDropDown.selectByVisibleText("1988");

		driver.findElement(signUpButton).click();
		Thread.sleep(6000);
		
		String signpSuccessMessage = driver.findElement(thankYouLabel).getText();
		return signpSuccessMessage;
	}
}
