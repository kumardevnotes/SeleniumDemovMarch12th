package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
  @Test
  public void myTestCase3() {
	  int num1=10;
	  int num2=20;
	  Assert.assertEquals(num1+num2, 30);
  }
  
  @Test
  public void myTestCase4() {
	  int num1=10;
	  int num2=20;
	  Assert.assertEquals(num2-num1, 0);
  }
  
}
