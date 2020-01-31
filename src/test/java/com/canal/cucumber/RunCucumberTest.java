package com.canal.cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@CucumberOptions( features = "src/test/resources/cucumber",plugin = {"pretty", "json:target/cucumber-report.json"})
public class RunCucumberTest {
}
