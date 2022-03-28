package com.thehartford.qa.bdd.commons;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.thehartford.qa.bdd.setup.BaseClass;
import com.thehartford.qa.bdd.utilities.ConsoleLogger;

public class CommonMethods {

	public void actionHoverOver(WebDriver driver,WebElement element) {
		Actions actions = new Actions(driver);
		try {
			BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
			actions.moveToElement(element).build().perform();
			ConsoleLogger.log("Hover Over performed on " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			ConsoleLogger.log("Element Not Found");
			Assert.fail();
		}
	}
	
	public String getText(WebElement element, String expected) {
		String text = null;
		try {
			BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
			text = element.getText();
			ConsoleLogger.log("Actual Value : " + text);
			Assert.assertEquals(expected, text);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			ConsoleLogger.log("Element Not Found");
			Assert.fail();
		}
		return text;
	}
	
	public void click(WebElement element) {
		try {
			BaseClass.wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			ConsoleLogger.log("Element has been clicked : "+ element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			ConsoleLogger.log("Element Not Found");
			Assert.fail();
		}
	}
	
	public void input(WebElement element, String inputText) {
		try {
			BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(inputText);
			ConsoleLogger.log(inputText + ", Text sent to : "+ element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			ConsoleLogger.log("Element Not Found");
			Assert.fail();
		}
	}
	
	public void input(WebElement element, int inputText) {
		try {
			BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(String.valueOf(inputText));
			ConsoleLogger.log(inputText + ", Text sent to : "+ element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			ConsoleLogger.log("Element Not Found");
			Assert.fail();
		}
	}
	
	public void assertTitle(WebDriver driver, String expected, String hint) {
		String title = driver.getTitle();
		ConsoleLogger.log("Title o the page is : " + title);
		String fixString = null;
		switch(hint) {
			case "homeTitle": //hint.equalsIgnoreCase("Home")
				fixString = getTitleForHome(title);
				break;
			default:
				fixString = title;
				break;
		}
		Assert.assertEquals(expected.replaceAll("[^a-zA-Z0-9]", " "), fixString.replaceAll("[^a-zA-Z0-9]", " "));
	}
	
	private static String getTitleForHome(String title) {
		return title.replace(title.substring(4,5),"");
	}
	
	public void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
			ConsoleLogger.log(sec + "Sleeping ...zZz...");
		} catch (InterruptedException e) {
			e.printStackTrace();
			ConsoleLogger.log("Sleeping Interrupted ...");
		}
	}
}
