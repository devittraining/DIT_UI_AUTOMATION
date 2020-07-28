package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="FeatureFiles/firstFeature.feature", glue="stepDefination")
@CucumberOptions(features="FeatureFiles", glue="stepDefination")


public class TestRunner {

}