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
}
