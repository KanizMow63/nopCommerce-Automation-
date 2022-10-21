package StepDefinition;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	@CucumberOptions(
			 features = "src/main/java/NOP_Registration",
			 glue = {"nop_station_reg/src/main/java/StepDefinition",}
			// plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		            // "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
		)
	public class RegTestRunner extends AbstractTestNGCucumberTests{
		
		
	 
	}
	

