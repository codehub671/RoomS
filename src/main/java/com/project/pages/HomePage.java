package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@class=\"button_button__HOmVR button_outlined__6Yk79\"]")
	WebElement Home_Login;

	public void clickLoginHome() {
		Home_Login.click();

	}

}
