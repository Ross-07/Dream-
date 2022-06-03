package com.Dream11.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Dream11.myProject.GenericLibrary.BaseClass;
import com.Dream11.myProject.GenericLibrary.MobileDriverUtility;
import com.Dream11.myProject.pom.HomePage;
import com.Dream11.myProject.pom.Registeration_Page;
import com.Dream11.myProject.pom.firstPage;
import com.Dream11.myProject.pom.profilePage;

import junit.framework.Assert;

public class ProfilePageScript extends BaseClass
{
	@Test
	public void ProfilePage() throws InterruptedException
	{

		HomePage hp = new HomePage(driver);
		MobileDriverUtility md=new MobileDriverUtility();
		Registeration_Page rgp = new Registeration_Page(driver);
		//profilePage pp = new profilePage(driver);
		Thread.sleep(5000);
		firstPage fp = new firstPage(driver);
		fp.clickOnContinue();
		rgp.clcikOnLoginBtn();
		Thread.sleep(2000);
		rgp.passMobileNum("7070030369");
		Thread.sleep(5000);
		rgp.clickNextBtn();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.ImageView")).click();
		//pp.clickOnProfileImage();
		WebElement textName = driver.findElement(By.xpath("//android.widget.TextView[@text='ROUSHAN WOLFPACK 327416']"));
	    String Actual = textName.getText();
		System.out.println(Actual);
		String Expected = "ROUSHAN WOLFPACK 327416";
		Assert.assertEquals(Expected, Actual);
		Reporter.log("Profile Page is Validating", true);
		
	    
	}
}
