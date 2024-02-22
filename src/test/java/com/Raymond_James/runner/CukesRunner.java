package com.Raymond_James.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/reports.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features ="src/test/resources/features",
        glue = "com/Raymond_James/step_definition",
        dryRun= false,
        tags="@user1",
        publish =true // generating a report with public link


)
public class CukesRunner {
}
