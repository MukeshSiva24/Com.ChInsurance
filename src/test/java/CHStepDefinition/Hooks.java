package CHStepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import CHCommonMethods.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	BaseClass base=BaseClass.getInstance();
	
	@Before
	public void browserLaunch() {
		base.browserLaunch();
	}
	
	@After
	public void browserClose(Scenario scenario) throws InterruptedException {
	
		try {
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				if (scenario.isFailed()) {
					scenario.wait();

					scenario.log("this is my failure message");
					TakesScreenshot ts = (TakesScreenshot) base.driver;
					byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", screenshotName);
				}
				else {
					scenario.log("this is Pass");
					TakesScreenshot ts = (TakesScreenshot) base.driver;
					byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", "Pass");
					
					Thread.sleep(3000);
					base.browserQuit();
				}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@AfterStep
	public void screenShot(Scenario scenario) {
//		scenario.log("it will take after each Test case");
		TakesScreenshot ts = (TakesScreenshot) base.driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", " ");
	
	
	}

}
