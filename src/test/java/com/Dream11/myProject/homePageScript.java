package com.Dream11.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Dream11.myProject.GenericLibrary.BaseClass;
import com.Dream11.myProject.GenericLibrary.MobileDriverUtility;
import com.Dream11.myProject.pom.HomePage;
import com.Dream11.myProject.pom.Registeration_Page;
import com.Dream11.myProject.pom.firstPage;

import junit.framework.Assert;

public class homePageScript extends BaseClass
{
	@Test
	public void homePage() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		MobileDriverUtility md=new MobileDriverUtility();
		Registeration_Page rgp = new Registeration_Page(driver);
		Thread.sleep(5000);
		firstPage fp = new firstPage(driver);
		fp.clickOnContinue();
		rgp.clcikOnLoginBtn();
		Thread.sleep(2000);
		rgp.passMobileNum("7070030369");
		rgp.clickNextBtn();
		Thread.sleep(10000);
		hp.clickOnBannerFeed1();
		//hp.clickOnBannerFeed2();
		//hp.clickOnBannerFeed3();
		//hp.clickOnBannerFeed1();
		WebElement text = driver.findElement(By.xpath("//android.widget.TextView[@text='FanCode ECS T10 - Czech Republic']"));
//		md.explicitWait(text, 10);
		md.scrollToElement(driver, "text","FanCode ECS T10 - Czech Republic" );
		String actual = text.getText();
		System.out.println(actual);
		String Expected = "FanCode ECS T10 - Czech Republic";
		Assert.assertEquals(Expected, actual);
	}
}
