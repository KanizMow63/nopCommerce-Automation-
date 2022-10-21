package StepDefinitionPlaceOrder;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features = "src/main/java/nopCommercePlaceHolder",
		 glue = {"src/main/java/StepDefinitionPlaceOrder",}
		 //plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	             //"timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
	)

public class PlaceOrderTestRunner {

}
