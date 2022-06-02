package com.Dream11.myProject.pom;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Registeration_Page 
{
	public AndroidDriver driver;
	public Registeration_Page(AndroidDriver driver) 
	{
			this.driver = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//android.widget.Button[@text='REGISTER']")
	private MobileElement selectRegisterBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log In']")
	private MobileElement loginBtn;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='REGISTER']")
	private MobileElement finalRegister;
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter your name']")
	private MobileElement enterNameTextField;
	@AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE NAME']")
	private MobileElement clickOnSaveNameBtn;
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Email or mobile no']")
	private MobileElement mobileNumField;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NEXT']")
	private MobileElement nextBtn;
	@AndroidFindBy(id =   "com.android.packageinstaller:id/permission_allow_button]")
	private MobileElement allowBtn;
	
	public MobileElement getAllowBtn() {
		return allowBtn;
	}

	public MobileElement getMobileNumField() {
		return mobileNumField;
	}

	public MobileElement getNextBtn() {
		return nextBtn;
	}

	public MobileElement getEnterNameTextField() {
		return enterNameTextField;
	}

	public MobileElement getClickOnSaveNameBtn() {
		return clickOnSaveNameBtn;
	}

//	public MobileElement getMobileNoField() {
//		return mobileNoField;
//	}

	public MobileElement getFinalRegister() {
		return finalRegister;
	}

	public AndroidDriver getDriver() 
	{
		return driver;
	}

	public MobileElement getSelectRegisterBtn() 
	{
		return selectRegisterBtn;
	}

	public MobileElement getLoginBtn() 
	{
		return loginBtn;
	}
	public void clickOnRegisterBtn()
	{
		selectRegisterBtn.click();
	}
	public void clcikOnLoginBtn()
	{
		loginBtn.click();
	}
//	public void sendMobNo(String num)
//	{
//		mobileNumField.sendKeys(num);
//	}
	public void clickOnFinalRegister()
	{
		finalRegister.click();
	}
	public void enterName(String name)
	{
		enterNameTextField.sendKeys(name);
	}
	public void clickOnSavename()
	{
		clickOnSaveNameBtn.click();
	}
	public void passMobileNum(String number)
	{
		mobileNumField.sendKeys(number);
	}
	public void clickNextBtn()
	{
		nextBtn.click();
	}
	public void clickOnAllowBtn()
	{
		allowBtn.click();
	}
	
	
	
	
	
}
