package com.thehartford.qa.bdd.steps;

import com.thehartford.qa.bdd.setup.BaseClass;
import com.thehartford.qa.bdd.utilities.ConsoleLogger;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoSteps extends BaseClass{

	@When("user move cursor onto Auto tab")
	public void user_move_cursor_onto_auto_tab() {
		commonMethods.actionHoverOver(driver, mainPage.autoTab);
		ConsoleLogger.log("This is a When statements where we hover over");
	}
	
	@Then("title {string} menu opened")
	public void title_menu_opened(String string) {
		String actual =  commonMethods.getText(mainPage.autoTabGroup1, string);
		ConsoleLogger.log("This is a Then statements has title : " + actual);
	}

}
