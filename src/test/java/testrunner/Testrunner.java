package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\deepu\\Rocians QA software classes\\eclipse\\Cucumber\\src\\test\\java\\feature",glue= {"loginparameterization"})

public class Testrunner {

}
