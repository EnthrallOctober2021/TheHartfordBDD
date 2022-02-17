package com.thehartford.qa.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@role='menubar']/descendant::span[contains(.,'Auto')]")
	public WebElement autoTab;
	@FindBy(xpath = "//div[@class='nav-sub-section-heading' and contains(.,'AUTO INSURANCE SOLUTIONS')]")
	public WebElement autoTabGroup1;
}
