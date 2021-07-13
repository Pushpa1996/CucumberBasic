package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		
		features="C:\\Users\\Deepak\\ecllipse\\CucumberTraining\\gmail.feature" ,
		
		glue= {"StepDefination"},
		plugin = {"pretty"},
				
				monochrome =true,
				
				publish = true
		
		
		
		
		)


public class RunTest {
	
	
	
	
	
	
	
	
	
	
	

}
