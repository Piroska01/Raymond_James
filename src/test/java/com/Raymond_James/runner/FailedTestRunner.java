package com.Raymond_James.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/rerun.txt",
        glue = "com/Masonite/step_definition"



)


public class FailedTestRunner {
}
