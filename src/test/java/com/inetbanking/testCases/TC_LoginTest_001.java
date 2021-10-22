package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws InterruptedException, IOException
	{

		//driver.get(baseURL);
		Logger.info("URL is Opened");
		 
		LoginPage lp = new LoginPage(driver);	
		Thread.sleep(5000);
		lp.setUserName(username);
		Logger.info("Entered Username");
		
		Thread.sleep(5000);
		lp.setPassword(password);
		Logger.info("Entered Password");
		Thread.sleep(5000);
		lp.clickSubmit();
		Logger.info("Click on Submit Button");
		Thread.sleep(5000);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			Logger.info("Login test Case Passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			Logger.error("Please Enter Correct UN and PWD");
		}
	}
}
