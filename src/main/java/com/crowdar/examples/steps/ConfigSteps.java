package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ConfigService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfigSteps extends PageSteps {

    @Then("Enable dark mode")
    public void enableDarkMode() {
        ConfigService.setDarkMode();
    }

    @When("The user enters the settings")
    public void theUserEntersTheSettings() {
        LoginService.getOptions();
    }

    @Then("Disable notifications")
    public void turnOffNotifications() {
        ConfigService.setNotifications();
    }
}
