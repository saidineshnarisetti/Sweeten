package com.herokuapp.matchingalgo.sweeten;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Geturl extends LaunchBrowser{
	@Parameters({ "url"}) // Used TestNg parameterization concept passing url to script
	@Test(priority=-1)
	public void getUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
