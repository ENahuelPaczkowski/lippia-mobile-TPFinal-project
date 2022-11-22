package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    @Then("Login page is displayed")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }

    @When("The user enter his email")
    public void theUserEnterHisEmail() {
        LoginService.setEmail(PropertyManager.getProperty("valid.email"));
    }

    @And("The user enter password")
    public void theUserEnterPassword() {
        LoginService.setPassword(PropertyManager.getProperty("valid.pass"));
    }

    @And("user login")
    public void userLogin() {
        LoginService.clickLoginButton();
    }

    @When("Logout")
    public void logout() {
        LoginService.logout();
    }

    @Then("Verify logout")
    public void verifyLogout() {
        LoginService.isViewLoaded();
    }

}
