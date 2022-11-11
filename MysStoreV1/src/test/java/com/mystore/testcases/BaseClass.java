package com.mystore.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	String url = readconfig.getBaseUrl();
	String browser = readconfig.getBrowser();

	public static WebDriver driver;

	public void setup() {

		String browser = "chrome";

		switch (browser.toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			driver = null;
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
