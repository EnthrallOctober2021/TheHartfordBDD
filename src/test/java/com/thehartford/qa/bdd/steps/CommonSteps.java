package com.thehartford.qa.bdd.steps;

import org.junit.Assert;
import com.thehartford.qa.bdd.setup.BaseClass;
import com.thehartford.qa.bdd.utilities.ConsoleLogger;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseClass{
	
	@Given("the title of the page {string}")
	public void the_title_of_the_page(String string) {
		String title = driver.getTitle();
		ConsoleLogger.log("Title o the page is : " + title);
		Assert.assertEquals(string, title);
	}
}
