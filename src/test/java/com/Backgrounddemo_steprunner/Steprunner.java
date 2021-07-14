package com.Backgrounddemo_steprunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Backgroundfeature",
 //junit= "---step-notification",
 glue={"com.Backgrounddemo_step"}
 )

public class Steprunner {

}
