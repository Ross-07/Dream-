package com.Dream11.myProject;

import org.testng.annotations.Test;

import com.Dream11.myProject.GenericLibrary.BaseClass;
import com.Dream11.myProject.GenericLibrary.MobileDriverUtility;
import com.Dream11.myProject.pom.firstPage;

public class firstPageScript extends BaseClass
{
	@Test
	public void test1() throws InterruptedException
	{
		Thread.sleep(10000);
		firstPage fp = new firstPage(driver);
		fp.clickOnContinue();
	}
}
