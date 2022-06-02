package com.Dream11.myProject.pom;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage
{
	public AndroidDriver driver;
	public HomePage(AndroidDriver driver)
	{
			this.driver = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.viewpager.widget.ViewPager[1]")
	private MobileElement bannerFeed1;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.viewpager.widget.ViewPager[2]")
	private MobileElement bannerFeed2;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.viewpager.widget.ViewPager[3]")
	private MobileElement bannerFeed3;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.viewpager.widget.ViewPager[4]")
	private MobileElement bannerFeed4;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎']")
	private MobileElement backBtn;
	public MobileElement getBackBtn() {
		return backBtn;
	}
	public AndroidDriver getDriver() {
		return driver;
	}
	public MobileElement getBannerFeed1() {
		return bannerFeed1;
	}
	public MobileElement getBannerFeed2() {
		return bannerFeed2;
	}
	public MobileElement getBannerFeed3() {
		return bannerFeed3;
	}
	public MobileElement getBannerFeed4() {
		return bannerFeed4;
	}
	public void clickOnBannerFeed1() throws InterruptedException
	{
		bannerFeed1.click();
		Thread.sleep(5000);
		backBtn.click();
	}
	public void clickOnBannerFeed2() throws InterruptedException
	{
		bannerFeed2.click();
		Thread.sleep(5000);
		backBtn.click();
		Thread.sleep(5000);
		driver.swipe(1150, 1244, 364, 1248, 500);
	}
	public void clickOnBannerFeed3() throws InterruptedException
	{
		bannerFeed3.click();
		Thread.sleep(5000);
		backBtn.click();
		Thread.sleep(5000);
		driver.swipe(1150, 1244, 364, 1248, 500);
	}
	public void clickOnBannerFeed4() throws InterruptedException
	{
		bannerFeed4.click();
		Thread.sleep(5000);
		backBtn.click();
		Thread.sleep(5000);
		driver.swipe(1150, 1244, 364, 1248, 500);
	}
}
