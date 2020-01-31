package com.canal.cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/cucumber",plugin = {"pretty", "json:target/cucumber-report.json"})
public class RunCucumberTest {
}
