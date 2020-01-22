package com.browserstack.cucumber.steps.globantsummit;

import com.browserstack.cucumber.models.Guest;
import com.browserstack.cucumber.pages.InitForm;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class StepWelcomeForm {

   InitForm summitFormPage;
    @Step
    public void OpenPage(){
        summitFormPage.open();

    }

    @Step
    public void filloutForm(Guest guest){
        summitFormPage.fillForm(guest);
    }

    @Step
    public void submitInformation(){
        summitFormPage.submitForm();
    }

}
