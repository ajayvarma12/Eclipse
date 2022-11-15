package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("www.google.com");
	
		System.out.println("inside step user");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {

		System.out.println("its a 2nd step");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("its happen");
	}

	@Then("user is navigated to home page")

	public void Then_user_is_navigated_to_home_page() {
		System.out.println("its a 3rd step");
	}
}
