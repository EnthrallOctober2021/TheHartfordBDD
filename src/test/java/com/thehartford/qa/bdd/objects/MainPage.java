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
	@FindBy(xpath = "//ul[@role='menubar']/descendant::span[contains(.,'Home')]")
	public WebElement homeTab;
	@FindBy(xpath = "//div[@class='nav-sub-section-heading' and contains(.,'AUTO INSURANCE SOLUTIONS')]")
	public WebElement autoTabGroup1;
	@FindBy(xpath = "//div[@data-dl-act='Home']/descendant::a[@title='Homeowners Insurance']")
	public WebElement homeownersInsurance;
}
