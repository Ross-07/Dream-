package com.Dream11.myProject.GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class MobileDriverUtility
{
	AndroidDriver driver = BaseClass.sdriver;
	
	public void getMobileDataOn()
	{
		driver.setConnection(Connection.DATA);
	}
	public void getAeroplaneModeOn()
	{
		driver.setConnection(Connection.AIRPLANE);
	}
	public void getWifiOn()
	{
		driver.setConnection(Connection.WIFI);
	}
	public void openNotification()
	{
		driver.openNotifications();
	}
	public void zoomInImage(WebElement element)
	{
		driver.zoom(element);
	}
	public void zoomOutImage(WebElement element)
	{
		driver.pinch(element);
	}
	public void landscapeMode()
	{
		driver.rotate(ScreenOrientation.LANDSCAPE);
	}
	public void portraitMode()
	{
		driver.rotate(ScreenOrientation.PORTRAIT);
	}
	public void scrollToElement(AndroidDriver driver, String an, String av) 
	{
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
	}
	public void hideKeboard()
	{
		driver.hideKeyboard();
	}
	public void dragAndDropAction(WebElement source,WebElement destination)
	{
		TouchAction ta = new TouchAction(driver);
		ta.longPress(source).waitAction().moveTo(destination).perform().release();
	}
	public void installApp(String appPath)
	{
		driver.installApp(appPath);
	}
	public void unInstallApp(String packageName)
	{
		driver.removeApp(packageName);
	}
	public boolean isAppInstalled(String packageName)
	{
		return driver.isAppInstalled(packageName);
		
	}
	public void runAppInBaackground(int duration)
	{
		driver.runAppInBackground(duration);
	}
	public void tapAction(AndroidDriver driver, int x, int y) {
		TouchAction tc = new TouchAction(driver);
		tc.tap(x, y);
	}
	public void tapAction(AndroidDriver driver, WebElement element, int x, int y) {
		TouchAction tc = new TouchAction(driver);
		tc.tap(element, x, y);
	}

	public void switchApp( String appPackage, String appActivity)
	{
		driver.startActivity(appPackage, appActivity);
	}
	public void swipeAction(int xStart,int yStart,int xEnd,int yEnd,int duration)
	{
		driver.swipe(xStart, yStart, xEnd, yEnd, duration);
	}
	public void implicitWait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public void explicitWait(WebElement element,int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

	
	
	
}
