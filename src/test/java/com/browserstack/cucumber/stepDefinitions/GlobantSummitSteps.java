package com.browserstack.cucumber.stepDefinitions;

import com.browserstack.cucumber.models.Guest;
import com.browserstack.cucumber.steps.globantsummit.StepGuestList;
import com.browserstack.cucumber.steps.globantsummit.StepNavbar;
import com.browserstack.cucumber.steps.globantsummit.StepLoadingFrame;
import com.browserstack.cucumber.steps.globantsummit.StepWelcomeForm;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GlobantSummitSteps {


    @Steps
    StepWelcomeForm summitFormStep;
    @Steps
    StepGuestList summitGuestListStep;
    @Steps
    StepNavbar navbarStep;
    @Steps
    StepLoadingFrame waitStep;

    Guest guest;

    @When("^I fill out the form$")
    public void fillOutTheform( DataTable guestDt) {
        guest = guestDt.asList(Guest.class).get(0);
        summitFormStep.OpenPage();
        summitFormStep.filloutForm(guest);
    }

    @And("^I submit$")
    public void thenSubmit()  {
        summitFormStep.submitInformation();
        waitStep.waitForPage();
    }

    @Then("^I should see the record on list page$")
    public void shouldSeeTheRecord() {
        navbarStep.clickOnListOfGuest();
        waitStep.waitForPage();
        summitGuestListStep.clickOnLastRecord();
        summitGuestListStep.checkLastRecord(guest);

    }
}
