package com.canal.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * @author m.zouari
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber")
public class CucumberTest {
}
