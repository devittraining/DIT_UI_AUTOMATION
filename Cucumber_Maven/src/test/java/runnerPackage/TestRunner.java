package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/java/FeatureFiles", 
glue = {"stepDefination"})


public class TestRunner {

}