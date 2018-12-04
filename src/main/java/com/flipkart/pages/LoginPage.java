package com.flipkart.pages;

import org.openqa.selenium.By;
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
	 static WebElement username_TxtBox;
	@FindBy(className = "_2zrpKA _3v41xv")
	 static WebElement password_TxtBox;
	@FindBy(xpath = "//button[@class='vh79eN']")
	 static WebElement Btn_submit;
	
	
	public void openApps() {
		openBrowser(ApplicationProperties.getProperty("browser"));
		getDriver().get(ApplicationProperties.getProperty("URL"));

	}

	public void login() throws InterruptedException {
		//login_Lnk.click();
		Thread.sleep(1000);
		String userName = ApplicationProperties.getProperty("Username");
		String password = ApplicationProperties.getProperty("Password");
		WebElement username_TxtBox =driver.findElement(By.xpath("//input[@class='_2zrpKA']"));
		username_TxtBox.sendKeys(userName);
		WebElement password_TxtBox =driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
		password_TxtBox.sendKeys(password);
		WebElement submit = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		submit.submit();
		Thread.sleep(2000);
	}

	public static void enter_Text(String value) {
		username_TxtBox.sendKeys(value);
		password_TxtBox.sendKeys(value);
	}
}
