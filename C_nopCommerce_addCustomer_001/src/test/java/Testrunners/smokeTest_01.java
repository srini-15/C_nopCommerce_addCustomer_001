package Testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\featureFiles\\addCustomer.feature",
glue={"Testrunners","appHooks"}
)

public class smokeTest_01 {

}
