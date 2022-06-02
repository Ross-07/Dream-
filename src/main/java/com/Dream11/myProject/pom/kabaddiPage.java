package com.Dream11.myProject.pom;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class kabaddiPage 
{
	public AndroidDriver driver;
	public kabaddiPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Kabaddi']")
	private MobileElement kabaddiBtn;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.viewpager.widget.ViewPager[1]")
	private MobileElement KabannerFeed1;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.viewpager.widget.ViewPager[2]")
	private MobileElement KabannerFeed2;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.viewpager.widget.ViewPager[3]")
	private MobileElement KabannerFeed3;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.viewpager.widget.ViewPager[4]")
	private MobileElement KabannerFeed4;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎']")
	private MobileElement backBtn;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Yuva Kabaddi Series']")
	private MobileElement text;
	public MobileElement getText() {
		return text;
	}
	public MobileElement getBackBtn() {
		return backBtn;
	}
	public AndroidDriver getDriver() {
		return driver;
	}
	public MobileElement getKabaddiBtn() {
		return kabaddiBtn;
	}
	public MobileElement getKabannerFeed1() {
		return KabannerFeed1;
	}
	public MobileElement getKabannerFeed2() {
		return KabannerFeed2;
	}
	public MobileElement getKabannerFeed3() {
		return KabannerFeed3;
	}
	public MobileElement getKabannerFeed4() {
		return KabannerFeed4;
	}
	public void clickOnBannerFeed1() throws InterruptedException
	{
		KabannerFeed1.click();
		Thread.sleep(5000);
		backBtn.click();
	}
	public void clickOnBannerFeed2() throws InterruptedException
	{
		KabannerFeed2.click();
		Thread.sleep(5000);
		backBtn.click();
		Thread.sleep(5000);
		driver.swipe(1150, 1244, 364, 1248, 500);
	}
	public void clickOnBannerFeed3() throws InterruptedException
	{
		KabannerFeed3.click();
		Thread.sleep(5000);
		backBtn.click();
		Thread.sleep(5000);
		driver.swipe(1150, 1244, 364, 1248, 500);
	}
	public void clickOnBannerFeed4() throws InterruptedException
	{
		KabannerFeed4.click();
		Thread.sleep(5000);
		backBtn.click();
		Thread.sleep(5000);
		driver.swipe(1150, 1244, 364, 1248, 500);
	}
	public void kabbadiBtn()
	{
		kabaddiBtn.tap(1, 200);
	}
	public void takeText()
	{
		text.getText();
	}
}
