package com.herokuapp.matchingalgo.sweeten;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Edit_Logout extends LaunchBrowser{  //Script for validating Edit, Logout options
	
	@Test(priority=18)
	public void Verify_Edit() throws InterruptedException
	{	 	
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/p/a[1]")).click();// Click on Show project
			Thread.sleep(3000);
			String act_Editpage_title = driver.findElement(By.xpath("/html/body/div/h2")).getText(); // by Xpath
		  	String exp_Editpage_title = "Edit User";
		  	Assert.assertEquals(act_Editpage_title, exp_Editpage_title);
	}
	@Test(priority=19)
	public void Verify_Logout() throws InterruptedException
	{	 	
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/p/a[2]")).click();// Click on Show project
			Thread.sleep(3000);
			String act_Logout_text = driver.findElement(By.xpath("/html/body/div/p")).getText(); // by Xpath
		  	String exp_Logout_text = "Signed out successfully.";
		  	Assert.assertEquals(act_Logout_text, exp_Logout_text);
	}

}
