package com.herokuapp.matchingalgo.sweeten;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Show_Edit_Projects extends LaunchBrowser { //Script for validating Show Edit Projects
	@Test(priority=8)
	public void Verify_Show_Projects() throws InterruptedException
	{	 	
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[8]/td[7]/a[1]")).click();// Click on Show project
			Thread.sleep(3000);
			String act_NewShprgt_title = driver.findElement(By.xpath("/html/body/div/h1")).getText(); // by Xpath
		  	String exp_NewShprgt_title = "Renovation Project List";
		  	Assert.assertEquals(act_NewShprgt_title, exp_NewShprgt_title);
		  	driver.navigate().back();
	}
	@Test(priority=9)
	public void Verify_Edit_Projects() throws InterruptedException
	{	 								
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[8]/td[7]/a[2]")).click();// Click on Show project
			Thread.sleep(3000);
			String act_NewEdprgt_title = driver.findElement(By.xpath("/html/body/div/h1")).getText(); // by Xpath
		  	String exp_NewEdprgt_title = "Editing General Contractor";
		  	Assert.assertEquals(act_NewEdprgt_title, exp_NewEdprgt_title);
		  	
	}
	@Test(priority=10)
	public void Verify_Update_Projects() throws InterruptedException
	{	 	
			driver.findElement(By.xpath("//*[@id=\"edit_general_contractor_10\"]/div[7]/div/button")).click();
			Thread.sleep(3000);
			String act_Upprgt_title = driver.findElement(By.xpath("/html/body/div/p[1]")).getText(); // by Xpath
		  	String exp_Upprgt_title = "General Contractor was successfully updated.";
		  	Assert.assertEquals(act_Upprgt_title, exp_Upprgt_title);
	}
}
