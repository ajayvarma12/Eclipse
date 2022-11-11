package CrossBrowserTesting;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser_Deom {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	
	public void LaunchBrowser(String browser) {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		switch (browser.toLowerCase()) {

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			driver = null;
			break;
		}

		
	}

	@Test

	public void VerifyTitle() {

		String exp_title = "Google";
		String act_tile = driver.getTitle();

		Assert.assertEquals(exp_title, act_tile);

	}

	@AfterMethod

	public void quit_browser() {

		driver.quit();
	}

}
