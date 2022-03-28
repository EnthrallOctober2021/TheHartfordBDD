package com.thehartford.qa.bdd.setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thehartford.qa.bdd.commons.CommonMethods;
import com.thehartford.qa.bdd.objects.HomeownersPage;
import com.thehartford.qa.bdd.objects.MainPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static CommonMethods commonMethods;
	public static MainPage mainPage;
	public static HomeownersPage homeownersPage;

	public static void initDriver() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thehartford.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		initClasses();
	}

	private static void initClasses() {
		commonMethods = new CommonMethods();
		mainPage = new MainPage(driver);
		homeownersPage = new HomeownersPage(driver);
	}
}
