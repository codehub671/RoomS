package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder=\"example@hi.com\"]")
	WebElement Email_TextField;

	@FindBy(xpath = "//input[@placeholder=\"********\"]")
	WebElement Password_TextField;

	@FindBy(xpath = "//button[@class=\"button_button__HOmVR button_filled__IJrBc submit-btn\"]")
	WebElement Login_Button;

	public void setEmailField(String email) {
		Email_TextField.sendKeys(email);

	}

	public void setPasswordField(String password) {
		Password_TextField.sendKeys(password);

	}

	public void clickLoginHome() {
		Login_Button.click();

	}

}
