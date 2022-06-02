package com.Dream11.myProject.pom;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class firstPage
{
	public AndroidDriver driver;
	public firstPage(AndroidDriver driver) 
	{
			this.driver = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//*[@text='English']/parent::android.widget.LinearLayout")
	private MobileElement selectEngLang;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='हिंदी - Hindi']")
	private MobileElement selectHindiLang;
	@AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
	private MobileElement clickContinue;
	public AndroidDriver getDriver() {
		return driver;
	}
	public MobileElement getSelectEngLang() {
		return selectEngLang;
	}
	public MobileElement getSelectHindiLang() {
		return selectHindiLang;
	}
	public MobileElement getClickContinue() {
		return clickContinue;
	}
	public void clickOnEnglishLang()
	{
		selectEngLang.click();
	}
	public void clickOnHindiLang()
	{
		selectHindiLang.click();
	}
	public void clickOnContinue()
	{
		clickContinue.click();
	}
}
