package com.browserstack.runners.parallels;

import com.browserstack.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/globantsummit.feature",
        glue={"com.browserstack.cucumber.stepDefinitions"})
public class ParallelFirefoxTest extends BrowserStackSerenityTest {

}
