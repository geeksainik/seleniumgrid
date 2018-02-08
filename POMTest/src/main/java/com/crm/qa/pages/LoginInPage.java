package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginInPage extends TestBase{
	
	//pageFactory -- OR
	@FindBy(name="username")
	WebElement username;
	
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(xpath="//input[@type='submit']")
    WebElement loginBtn;
    
    @FindBy(xpath="//button[contains(text(),'Sign Up')]")
    WebElement signUpBtn;
    
    @FindBy(xpath="//img[contains(@class,'img-responsive')]")
    WebElement crmLogo;
    
    //Initializing the Page Objects
    
	public LoginInPage()
	{
		PageFactory.initElements(driver,this);
	}

	//Actions
public  String validateLoginPageTitle()
{
	return driver.getTitle();
}
public boolean ValidateCRMImage()
{
	return crmLogo.isDisplayed();
}
public HomePage login(String un,String pwd)
{
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginBtn.click();
	return new HomePage();
}



}
