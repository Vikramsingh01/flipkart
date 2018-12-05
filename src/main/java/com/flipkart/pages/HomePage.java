package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.utills.BasicUtill;

public class HomePage extends BasicUtill {
	

	public void logout() {

	}

	public void chooseRam() throws InterruptedException {
		WebElement search_Box = driver.findElement(By.xpath("//input[@type='text']"));
		search_Box.sendKeys("Mobiles");
		search_Box.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement checkBox = driver.findElement(By.xpath("//div[@title='4 GB']"));
		checkBox.click();
		Thread.sleep(4000);
	}

	public void chooseBrand() throws InterruptedException {
		WebElement search_Brand = driver.findElement(By.xpath("//input[@class='_3vKPvR']"));
		search_Brand.sendKeys("Moto");
		Thread.sleep(2000);
		WebElement checkbox_Brand = driver.findElement(By.xpath("//div[text()='Motorola']"));
		checkbox_Brand.click();
	}

	public void verifyFilteredlist() throws InterruptedException {
		WebElement title1 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]"));
		String titleText1 = title1.getText();
		titleText1.contains("Moto");
		WebElement title2 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[2]"));
		String titleText2 = title2.getText();
		titleText2.contains("Moto");
		Thread.sleep(2000);
		WebElement clear_All = driver.findElement(By.xpath("(//span[text()='Clear all'])[1]"));
		clear_All.click();
		Thread.sleep(3000);
		WebElement otherTitle1 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]"));
		String OtherText1 = otherTitle1.getText();
		OtherText1.contains("Redmi");
	}

	public void chooseMobile() throws InterruptedException {
		WebElement search_Box = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		search_Box.clear();
		search_Box.sendKeys("MotoG5");
		search_Box.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement title_motoG5 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]"));
		title_motoG5.click();

	}

	public void addToCart() throws InterruptedException {
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.CONTROL).clickAndHold().sendKeys(Keys.TAB);
		String currentUrl = driver.getCurrentUrl();
		WebElement addtoCart_Btn = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		addtoCart_Btn.click();
		Thread.sleep(3000);

	}

	public void removeFromCart() throws InterruptedException {
		WebElement removeFromCart = driver.findElement(By.xpath("(//span[text()='Remove'])[1]"));
		removeFromCart.click();	
		Thread.sleep(3000);
	}

}
