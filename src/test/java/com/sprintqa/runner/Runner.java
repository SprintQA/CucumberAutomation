package com.sprintqa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src\\test\\resources\\feature", 
					glue = "com.sprintqa.stepDef", 
					monochrome = true,
					plugin = {"json:target/cucumber.json"}
				)
public class Runner {

}
