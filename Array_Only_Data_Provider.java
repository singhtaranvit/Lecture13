package com.Lecture13;

import org.testng.annotations.DataProvider;

public class Array_Only_Data_Provider {

	@DataProvider(name = "rediff")
	public static Object[][] getRediffData() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
							{"seleniumpanda1@rediffmail.com", "Donkey@123" } };
		return data;
	}

	@DataProvider(name = "TNinja")
	public static Object[][] getTNData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
							{ "seleniumpanda1@gmail.com", "Selenium@123" },
							{ "seleniumpanda2@gmail.com", "Selenium@123" },
							{ "seleniumpanda3@gmail.com", "Selenium@123" },
							{ "seleniumpanda4@gmail.com", "Selenium@123" }};
		return data;

	}
}

