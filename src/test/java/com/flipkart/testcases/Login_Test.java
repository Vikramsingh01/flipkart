package com.flipkart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginPage;
import com.flipkart.utills.BasicUtill;

public class Login_Test {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();

	@BeforeTest
	public void openBrowserAndApps() {
		loginPage.openApps(); 

	}

	@BeforeMethod
	public void loginTest() throws InterruptedException {
		loginPage.login();
	}

	@Test(priority = 0)
	public void searchForMobile() throws InterruptedException {
		homePage.chooseRam();
		homePage.chooseBrand();
		homePage.verifyFilteredlist();
		homePage.chooseMobile();
		homePage.addToCart();
		homePage.removeFromCart();
	}
	/*@Test(priority = 1)
	public void selectMobile() throws InterruptedException {
		homePage.chooseMobile();
		homePage.addToCart();
		homePage.removeFromCart();
		
	}
*/
	@AfterMethod(alwaysRun = true)
	public void logoutFromApps() {
		//homePage.logout();
	}

	@AfterTest(alwaysRun = true)
	public void closeBrowser() {
		BasicUtill.tearDown();
	}
}
