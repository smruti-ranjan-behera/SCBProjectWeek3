import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="com.allFeatures",glue="com.stepDefn")
public class CucumberRunner extends AbstractTestNGCucumberTests
{

}
