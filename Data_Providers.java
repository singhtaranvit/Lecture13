package com.Lecture13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Data_Providers {
	WebDriver driver;
	SoftAssert sA;

	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		sA = new SoftAssert();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "rediff", priority = 2)
	public void enterLoginIdAndPasssword(String username, String password) {
		driver.get("https://www.rediff.com");
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
	}

	@Test(dataProvider = "TNinja", priority = 1)
	public void loginCheckTNinja(String username, String password) {
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement Logout = driver.findElement(By.linkText("Logout"));
		sA.assertTrue(Logout.isDisplayed(),"Element is not displayed");
		sA.assertAll();
	}

	@DataProvider(name = "rediff")
	public Object[][] getRediffData() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
							{"seleniumpanda1@rediffmail.com", "Donkey@123" } };
		return data;
	}

	@DataProvider(name = "TNinja")
	public Object[][] getTNData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
							{ "seleniumpanda1@gmail.com", "Selenium@123" },
							{ "seleniumpanda2@gmail.com", "Selenium@123" },
							{ "seleniumpanda3@gmail.com", "Selenium@123" },
							{ "seleniumpanda4@gmail.com", "Selenium@123" }};
		return data;

	}
}