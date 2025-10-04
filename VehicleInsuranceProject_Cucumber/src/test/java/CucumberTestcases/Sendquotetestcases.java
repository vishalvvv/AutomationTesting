package CucumberTestcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\BasicPack\\Sendquote.feature",glue= {"SendquoteRunsteps"})
public class Sendquotetestcases {

}
