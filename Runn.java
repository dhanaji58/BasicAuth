package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features=".\\src\\test\\java\\featurefiles",
glue="stepdef",
dryRun=false,
monochrome=true,
plugin= {"pretty"}
)

public class Runn extends AbstractTestNGCucumberTests{

}
