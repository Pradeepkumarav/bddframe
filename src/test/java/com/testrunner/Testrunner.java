package com.testrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "features",
 //junit= "---step-notification",
 glue={"com.stepdefination"}
 )


public class Testrunner {

	
}
