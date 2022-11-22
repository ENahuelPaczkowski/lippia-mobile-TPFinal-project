package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ConfigConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ConfigService {
    public static void setDarkMode() {
        clickSetting();
        MobileActionManager.waitClickable(ConfigConstants.DARKMODE_BUTTON);
        MobileActionManager.click(ConfigConstants.DARKMODE_BUTTON);
        WebElement element = MobileActionManager.getElement(ConfigConstants.DARKMODE_BUTTON);
        Assert.assertTrue(element.getAttribute("checked").equals("true"), "La opcion Enable dark mode no esta seleccionada");
        MobileActionManager.waitClickable(ConfigConstants.DARKMODE_BUTTON);
        MobileActionManager.click(ConfigConstants.DARKMODE_BUTTON);
    }

    public static void clickSetting(){
        MobileActionManager.waitClickable(ConfigConstants.SETTING_BUTTON);
        MobileActionManager.click(ConfigConstants.SETTING_BUTTON);
    }

    public static void setNotifications() {
        clickSetting();
        MobileActionManager.waitClickable(ConfigConstants.NOTIFICATIONS_BUTTON);
        MobileActionManager.click(ConfigConstants.NOTIFICATIONS_BUTTON);
        WebElement element = MobileActionManager.getElement(ConfigConstants.NOTIFICATIONS_BUTTON);
        Assert.assertFalse(element.getAttribute("checked").equals("true"),"La opcion Show notifications sigue activada");
        MobileActionManager.waitClickable(ConfigConstants.NOTIFICATIONS_BUTTON);
        MobileActionManager.click(ConfigConstants.NOTIFICATIONS_BUTTON);
        ;
    }
}
