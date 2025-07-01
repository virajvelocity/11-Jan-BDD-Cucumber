package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		//Path of feature file
	features = {"D:\\BDDCucumber\\11_Jan_BDDCucumber\\src\\test\\resources\\Appfeatures"},	
		
		//Map/glue Test Steps with Methods of step definition class
	glue = {"Stepdefination", "Hooks"},  //Packagename of Step defination Class
	
	plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
	
	//publish=true
)


public class Runnerclass extends AbstractTestNGCucumberTests 
{

}
