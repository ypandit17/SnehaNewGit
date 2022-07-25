package com.TestNg.practise;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Ng {
	@BeforeSuite()
	public void Browser_Open() {
		System.out.println("I am in Browser");
	}
	@Test(timeOut =700)
	@Parameters({ "Myname"})
	
	public void Login(String name) {
	
		System.out.println(name);
		
		
	}
	
	@Test
	public void Homepage() {
		
		System.out.println("I am in homepage");
		Assert.assertEquals(false,false);
	}
	@AfterSuite
	public void Logout(){
		
		System.out.println("I am logout");
		
	}
}
