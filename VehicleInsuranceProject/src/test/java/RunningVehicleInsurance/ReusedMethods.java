package RunningVehicleInsurance;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ReusedMethods extends ExecuteTestCases{
	
	public void screenshot(String c) throws IOException {
		File A = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File B = new File("C:\\Users\\Vishal\\Automation Testing\\VehicleInsuranceProject\\TestProofs\\" + c + ".jpg");
		FileHandler.copy(A, B);

	}

}
