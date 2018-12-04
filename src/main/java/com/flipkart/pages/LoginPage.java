package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.Element;
import org.w3c.dom.UserDataHandler;

import com.flipkart.utills.ApplicationProperties;
import com.flipkart.utills.BasicUtill;

public class LoginPage extends BasicUtill {

	@FindBy(xpath = "//a[text()='Login & Signup']")
	private WebElement login_Lnk;
	@FindBy(xpath = "//input[@class='_2zrpKA']")
	private static WebElement username_TxtBox;
	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv']")
	private static WebElement password_TxtBox;
	@FindBy(xpath = "//button[@class='vh79eN']")
	private static WebElement Btn_submit;
	
	
	public void openApps() {
		openBrowser(ApplicationProperties.getProperty("browser"));
		getDriver().get(ApplicationProperties.getProperty("URL"));

	}

	public void login() {
		String userName = ApplicationProperties.getProperty("Username");
		String password = ApplicationProperties.getProperty("Password");
		enter_Text(userName);
		enter_Text(password);
		Btn_submit.submit();
	}

	public static void enter_Text(String value) {
		username_TxtBox.sendKeys(value);
		password_TxtBox.sendKeys(value);
	}
}
