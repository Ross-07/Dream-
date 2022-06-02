package com.Dream11.myProject.GenericLibrary;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass
{
	public static AndroidDriver sdriver;
	public AndroidDriver driver;
	public AppiumDriverLocalService server;
	public FileUtils fUtils = new FileUtils();
	public ExcelUtils eUtils = new ExcelUtils();
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("DataBase connection has been Established");
	}
	@BeforeTest
	public void btConfig()
	{
		System.out.println("Start Parallel Execution");
	}
	@BeforeClass
	public void bcConfig()
	{
		//AppiumDriverLocalService server = AppiumDriverLocalService.buildDefaultService();
	//	server.start();
		System.out.println("Start Server");
	}
	@BeforeMethod
	public void bmConfig() throws IOException
	{
		
		
		String url = fUtils.getDataFromPropertyFile("url");
		String udid = fUtils.getDataFromPropertyFile("deviceID");
		String deviceName = fUtils.getDataFromPropertyFile("deviceName");
		String platformName = fUtils.getDataFromPropertyFile("platformName");
		String platformVersion = fUtils.getDataFromPropertyFile("platformVersion");
		String appPackage = eUtils.getDataFromExcelFile(IPathconstant.SHEET_NAME, 1, 1);
		String appActivity = eUtils.getDataFromExcelFile(IPathconstant.SHEET_NAME, 1, 2);
		
	
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		  
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.UDID, udid);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		cap.setCapability("autoGrantPermissions", true);
		URL urL = new URL(url);
		cap.setCapability("appPackage",appPackage);
		cap.setCapability("appActivity", appActivity);
		driver = new AndroidDriver(urL,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.launchApp();
	}
	@AfterMethod
	public void amConfig()
	{
		//driver.closeApp();
		System.out.println("close the app");
	}
	@AfterClass
	public void acConfig()
	{
		//server.stop();
		System.out.println("===========stop server=============");
	}
	@AfterTest
	public void atConfig()
	{
		System.out.println("===========Stop parallel execution============");
	}
	@AfterSuite
	public void asConfig()
	{
		System.out.println("database connnection closed");
	}
}
