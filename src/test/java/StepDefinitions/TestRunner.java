package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",
glue= {"StepDefinitions"},monochrome=true,
plugin={"pretty","junit:target/JUnitReports/report.xml"})
public class TestRunner {

}
