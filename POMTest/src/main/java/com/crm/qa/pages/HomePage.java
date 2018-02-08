package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//PageFactory -OR
	
    @FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
	WebElement userNameDisplay;
    
    @FindBy(xpath="//a[contains(text(),'Contacts')]")
    WebElement contacts;
	

}
