package AddoneEmp;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\BasicPack\\OneEmp.feature",glue= {"AddoneEmp"})

public class OneEmployeeclass {

}
