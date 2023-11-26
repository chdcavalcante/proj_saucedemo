package Proj.aut.saucedemo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = "Proj.aut.saucedemo.steps", 
		dryRun = true,
		tags = "",
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		plugin = {"pretty", "html:target/cucumber-report.html" })
public class Executa {

}
