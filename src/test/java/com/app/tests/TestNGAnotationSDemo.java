package com.app.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnotationSDemo {
	@Test
	public void testCase1() {
		System.out.println("testCase1 passed");
	}

	@Test
	public void testCase2() {
		System.out.println("testCase2 passed");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite completed");
	}
	

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest completed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass completed");
	}
	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod completed");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite completed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass completed");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest completed");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod completed");
	}


}
