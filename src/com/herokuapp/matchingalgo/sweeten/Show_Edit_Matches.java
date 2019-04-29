package com.herokuapp.matchingalgo.sweeten;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Show_Edit_Matches extends LaunchBrowser { //Script for validating Show Edit Matches
	
	@Test(priority=15)
	public void Verify_Find_Matches() throws InterruptedException
	{	 	
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[4]/td[7]/a[2]")).click();// Click on Show project
			Thread.sleep(3000);
			String act_Find_Matche_title = driver.findElement(By.xpath("/html/body/div/h1")).getText(); // by Xpath
		  	String exp_Find_Matche_title = "Matched General Contractors";
		  	Assert.assertEquals(act_Find_Matche_title, exp_Find_Matche_title);
		  	driver.navigate().back();
	}
	@Test(priority=16)
	public void Verify_ReEdit_Projects() throws InterruptedException
	{	 								
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[4]/td[7]/a[1]")).click();// Click on Show project
			Thread.sleep(3000);
			String act_ReEdit_title = driver.findElement(By.xpath("/html/body/div/h1")).getText(); // by Xpath
		  	String exp_ReEdit_title = "Editing Renovation Project";
		  	Assert.assertEquals(act_ReEdit_title, exp_ReEdit_title);
		  	
	}
	@Test(priority=17)
	public void Verify_ReUpdate_Projects() throws InterruptedException
	{	 	
			driver.findElement(By.xpath("//*[@id=\"edit_renovation_project_6\"]/div[7]/div/button")).click();
			Thread.sleep(3000);
			String act_ReUpdate_title = driver.findElement(By.xpath("/html/body/div/p[1]")).getText(); // by Xpath
		  	String exp_ReUpdate_title = "Renovation Project was successfully updated.";
		  	Assert.assertEquals(act_ReUpdate_title, exp_ReUpdate_title);
	}

}
