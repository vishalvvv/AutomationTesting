package CucumberTestcases123;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\BasicPack\\Data.feature",glue= {"RunSteps"})
public class Cucumbertestcases {

}
