package com.browserstack.cucumber.steps.globantsummit;

import com.browserstack.cucumber.pages.FooterPage;
import com.browserstack.cucumber.pages.NavbarPage;
import net.thucydides.core.annotations.Step;

public class StepNavbar {

   NavbarPage navbarPage;
    @Step
    public void clickOnListOfGuest(){
        navbarPage.clickOnList();

    }


}
