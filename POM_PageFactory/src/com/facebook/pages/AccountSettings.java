package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.Constants;

public class AccountSettings {

	@FindBy(name=Constants.editPassword)
	WebElement editPasswordLink;
	@FindBy(css=Constants.oldPassword)
	WebElement oldPasswordInput;
	@FindBy(xpath=Constants.newPassword)
	WebElement newPasswordInput;
	@FindBy(xpath=Constants.confirmPassword)
	WebElement confirmPasswordInput;
	@FindBy(xpath=Constants.confirmButton)
	WebElement confimPasswordButton;
	
	public void changePassword(String oldPassword, String newPassword){
		editPasswordLink.click();
		oldPasswordInput.sendKeys(oldPassword);
		newPasswordInput.sendKeys(newPassword);
		confirmPasswordInput.sendKeys(newPassword);
		confimPasswordButton.click();
	}

}
