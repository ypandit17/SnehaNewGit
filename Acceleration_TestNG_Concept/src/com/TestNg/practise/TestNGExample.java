package com.TestNg.practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGExample {
  @Test
  public void f() {
	  System.out.println("I am test case Method");
  }
  
  public void f1() {
	  System.out.println("I am test case2  Method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after Method");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am before Class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am after Class");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am after Test");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am before Suite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am after Suite");

  }

}
