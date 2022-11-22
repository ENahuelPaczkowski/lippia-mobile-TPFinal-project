package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EntryConstants;
import com.crowdar.examples.constants.HomeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EntryService {

    public static void clickAddButton() {
        MobileActionManager.click(HomeConstants.ADD_TIME_BUTTON_LOCATOR);
    }

    public static void setHours(String hours) {
        WebElement element = MobileActionManager.getElement(EntryConstants.HOURS_INPUT);
        while (!element.getText().equals(hours)) {
            MobileActionManager.click(EntryConstants.INCREASE_HOUR);
        }
    }

    public static void setMinutes(String minutes) {
        WebElement element = MobileActionManager.getElement(EntryConstants.MINUTES_INPUT);
        while (!element.getText().equals(minutes)) {
            MobileActionManager.click(EntryConstants.INCREASE_MINUTES);
        }
    }

    public static void clickSaveButton() {
        MobileActionManager.click(EntryConstants.SAVE_BUTTON);
    }

    public static void verifyNewTime() {
        MobileActionManager.waitVisibility(EntryConstants.TIME_ENTRY);
        Assert.assertTrue(MobileActionManager.isVisible(EntryConstants.TIME_ENTRY), "No se puede verificar nueva entrada");
    }

    public static void deleteEntry() {
        MobileActionManager.click(EntryConstants.ENTRY_OPTIONS);
        MobileActionManager.click(EntryConstants.DELETE_BUTTON);
    }

    public static void verifyNoTimeEntries() {
        MobileActionManager.waitVisibility(EntryConstants.NO_TIME_ENTRIES);
        Assert.assertTrue(MobileActionManager.isVisible(EntryConstants.NO_TIME_ENTRIES), "No se encontro el mensaje: No time entries yet");
    }

    public static void discardEntry() {
        MobileActionManager.waitVisibility(EntryConstants.DISCRAD_BUTTON);
        MobileActionManager.click(EntryConstants.DISCRAD_BUTTON);
        MobileActionManager.waitVisibility(EntryConstants.CONFIRM_DISCARD);
        MobileActionManager.click(EntryConstants.CONFIRM_DISCARD);
    }
}
