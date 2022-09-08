package stepdefination;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import util.TestContextsetup;

public class Hooks {
	//private static final org.openqa.selenium.OutputType OutputType.FILE = null;
	TestContextsetup testContextSetup;
	public Hooks(TestContextsetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
		
	}
	
	@After
	public void AfterScenario() throws IOException {
	
		
		testContextSetup.base.WebDrivermanager();
		//driver.quit();

}
}
