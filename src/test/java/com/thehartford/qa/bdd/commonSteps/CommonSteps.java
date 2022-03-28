package com.thehartford.qa.bdd.commonSteps;

import com.thehartford.qa.bdd.setup.BaseClass;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseClass{
	
	@Given("the title of the page {string} has {string}")
	public void the_title_of_the_page(String string, String string1) {
		commonMethods.assertTitle(driver, string, string1);
	}
}
