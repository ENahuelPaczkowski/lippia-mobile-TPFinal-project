package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.EntryService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EntrySteps extends PageSteps {

    @When("click on Add time entry button")
    public void clickOnAddTimeEntryButton() {
        EntryService.clickAddButton();

    }

    @And("Add hours '(.*)'")
    public void addHoursHours(String hours) {
        EntryService.setHours(hours);
    }

    @And("Add minutes '(.*)'")
    public void addMinutesMinutes(String minutes) {
        EntryService.setMinutes(minutes);
    }

    @And("Save new time")
    public void saveNewTime() {
        EntryService.clickSaveButton();
    }

    @Then("Verify added time")
    public void verifyAddedTime() {
        EntryService.verifyNewTime();
    }

    @When("Delete entry")
    public void deleteEntry() {
        EntryService.deleteEntry();
        EntryService.verifyNoTimeEntries();
    }

    @Then("verify no time entries")
    public void verifyNoTimeEntries() {
        EntryService.verifyNoTimeEntries();
    }

    @And("Discard entry")
    public void discardEntry() {
        EntryService.discardEntry();
    }
}
