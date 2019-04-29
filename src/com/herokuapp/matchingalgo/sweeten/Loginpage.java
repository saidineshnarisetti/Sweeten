package com.herokuapp.matchingalgo.sweeten;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginpage extends LaunchBrowser{
	@Parameters({ "username", "password", "Loginmsg"}) // Used TestNg parameterization concept passing username,password and Loginmsg
	@Test(priority=0)
        public void verifylogin(String username,String password,String Loginmsg) throws InterruptedException{
    	driver.findElement(By.id("user_email")).sendKeys(username);
        driver.findElement(By.id("user_password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[4]/div[2]/div/div/button")).click();
        
        
        String actualLoginmsg =driver.findElement(By.xpath("/html/body/div/p")).getText();
	    Assert.assertEquals(actualLoginmsg, Loginmsg);
        
        	
        	
	}
}
