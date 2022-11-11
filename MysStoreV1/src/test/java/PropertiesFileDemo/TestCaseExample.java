package PropertiesFileDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {
	public static void main(String[] args) throws InterruptedException {
		
	
	{
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		ReadConfigFile obj=new ReadConfigFile();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		

		
		driver.findElement(By.name("username")).sendKeys(obj.getusername());
		driver.findElement(By.name("password")).sendKeys(obj.getpassword());

		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		driver.quit();
	}

	}

}