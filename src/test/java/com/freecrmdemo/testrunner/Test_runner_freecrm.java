package com.freecrmdemo.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	 features = "freecrmfeature",
	 //junit= "---step-notification",
	 glue={"com.freecrmdemo.stepdefination"}
	 )


	public class Test_runner_freecrm {

		
	}
