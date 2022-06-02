package com.Dream11.myProject;

import org.testng.annotations.Test;

import com.Dream11.myProject.GenericLibrary.BaseClass;
import com.Dream11.myProject.GenericLibrary.MobileDriverUtility;
import com.Dream11.myProject.pom.Registeration_Page;
import com.Dream11.myProject.pom.firstPage;

public class login_Script extends BaseClass
{
	@Test
	public void loginPage() throws InterruptedException
	{
		MobileDriverUtility mdu = new MobileDriverUtility();
		Registeration_Page rgp = new Registeration_Page(driver);
		Thread.sleep(5000);
		firstPage fp = new firstPage(driver);
		fp.clickOnContinue();
		rgp.clcikOnLoginBtn();
		Thread.sleep(2000);
		rgp.passMobileNum("7070030369");
		rgp.clickNextBtn();
		Thread.sleep(10000);
	
		
	}
}
