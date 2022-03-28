package com.thehartford.qa.bdd.hooks;

import com.thehartford.qa.bdd.setup.BaseClass;
import com.thehartford.qa.bdd.utilities.ConsoleLogger;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	
	@Before
	public void initiating() {
		ConsoleLogger.log("Initiating BDD tests");
		BaseClass.initDriver();
	}
	
	@After
	public void tearUp() {
		BaseClass.driver.quit();
	}
}
