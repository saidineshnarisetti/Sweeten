package com.herokuapp.matchingalgo.sweeten;

import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Header_footer extends LaunchBrowser{		//Script for validating header and footer section 
	@Test(priority=1)
	//@Test(priority=1,invocationCount = 100) // invocationCount used to repeat test case n number of times  
	public void verifySweetenlogo_Usr() throws InterruptedException
	{	 	
		  	WebElement sweetenlogo = driver.findElement(By.className("navbar-brand")); // by className
		  	String act_logourl =sweetenlogo.getAttribute("href");
		  	String exp_logourl = "https://sweeten-matching-algo.herokuapp.com/";
		  	Assert.assertEquals(act_logourl, exp_logourl);
		  
		  	
	}
	
	@Test(priority=2)
	public void verifyEditProfile()throws InterruptedException
	  {
		WebElement Editprofile = driver.findElement(By.className("navbar-link")); // by className
	  	String act_Editprofile =Editprofile.getAttribute("href");
	  	String exp_Editprofilel = "https://sweeten-matching-algo.herokuapp.com/users/edit";
	  	Assert.assertEquals(act_Editprofile, exp_Editprofilel);
	   }
	@Test(priority=3)
	public void verifyFooter()throws InterruptedException
	  {
		String act_Footer = driver.findElement(By.className("col-lg-12")).getText(); // by className
		int year = Year.now().getValue();
	  	String exp_Footer = "Copyright © Sweeten " + year;
	  	Assert.assertEquals(act_Footer, exp_Footer);
	   }

}
