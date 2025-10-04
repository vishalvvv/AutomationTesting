package CucumberTestcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\BasicPack\\Vehicledata.feature",glue= {"VehicledataRunsteps"})
public class Vehicledatatestcases {

}
