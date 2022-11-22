package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void setEmail(String email){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
    }

    public static void setPassword(String password) {
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.SIGN_UP_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void clickLoginButton() {
        MobileActionManager.click(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
    }

    public static void getOptions() {
        MobileActionManager.click(LoginConstants.OPTIONS_BUTTON);
    }

    public static void logout() {
        MobileActionManager.click(LoginConstants.LOGOUT_BUTTON);
        MobileActionManager.click(LoginConstants.CONFIRM_BUTTON);
    }
}
