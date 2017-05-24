package fiuba;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/* Si bien el codigo del proyecto esta en castellano, en esta clase la mantenemos en ingles pues es la convencion de la herramienta */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = false, tags={"~@wip"}, features = "src/test/resources/features", format = {
		"pretty",
		"html:target/reports/cucumber",
		"json:target/reports/cucumber.json",
		"junit:target/reports/cucumber.xml"
		})
public class RunFeatureTest {

}
