package com.browserstack.cucumber.steps.globantsummit;

import com.browserstack.cucumber.models.Guest;
import com.browserstack.cucumber.pages.FooterPage;
import com.browserstack.cucumber.pages.InitForm;
import com.browserstack.cucumber.pages.NavbarPage;
import net.thucydides.core.annotations.Step;

public class StepLoadingFrame {

   FooterPage footerPage;
    @Step
    public void waitForPage(){
        footerPage.waitForLoadedPage();

    }


}
