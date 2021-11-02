package com.demoguru.prueba.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.demoguru.prueba.features/demoguru.feature",
        glue = "com/demoguru/prueba/stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Usuario,@NuevaCuenta")
public class RegistroRunner {
}
