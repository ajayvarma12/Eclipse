package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver ldriver;;

	public MyAccountPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

//identify web elements
	@FindBy(id = "email_create")
	WebElement createEmailId;

	@FindBy(id = "SubmitCreate")
	WebElement submit;

//identify action

	public void enterCreateEmailAddress(String emailAdd) {
		createEmailId.sendKeys("emailAdd");

	}

	public void clickSubmit() {
		submit.click();

	}

}
