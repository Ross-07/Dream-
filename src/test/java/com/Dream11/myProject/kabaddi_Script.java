package com.Dream11.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Dream11.myProject.GenericLibrary.BaseClass;
import com.Dream11.myProject.GenericLibrary.MobileDriverUtility;
import com.Dream11.myProject.pom.HomePage;
import com.Dream11.myProject.pom.Registeration_Page;
import com.Dream11.myProject.pom.firstPage;
import com.Dream11.myProject.pom.kabaddiPage;

import junit.framework.Assert;

public class kabaddi_Script extends BaseClass
{
	/**
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void kabadddiPage() throws InterruptedException
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
		kabaddiPage kp = new kabaddiPage(driver);
		kp.kabbadiBtn();
		kp.clickOnBannerFeed1();
		WebElement kabaddiText = driver.findElement(By.xpath("//android.widget.TextView[@text='Yuva Kabaddi Series']\""));
		md.scrollToElement(driver, "text", "Yuva Kabaddi Series");
		String ActualText = kabaddiText.getText();
		String ExpectedText = "Yuva Kabaddi Series";
		Assert.assertEquals(ActualText, ExpectedText);
		

	}
}
