package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void start(Scenario scenario) {
        System.out.println("Starting " + scenario.getName());
    }
}
