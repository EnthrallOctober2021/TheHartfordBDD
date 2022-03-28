package com.thehartford.qa.bdd.homeSteps;

import com.thehartford.qa.bdd.setup.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps extends BaseClass{

	@Given("user move cursor on Home tab")
	public void user_move_cursor_on_home_tab() {
		commonMethods.actionHoverOver(driver, mainPage.homeTab);
	}

	@When("user click on Homeowners Insurance")
	public void user_click_on_homeowners_insurance() {
		commonMethods.click(mainPage.homeownersInsurance);
		commonMethods.sleep(5);
	}

	@When("zipCode {int} enter")
	public void zip_code_enter(Integer int1) {
		commonMethods.input(homeownersPage.zipInput, int1);
	}

}
