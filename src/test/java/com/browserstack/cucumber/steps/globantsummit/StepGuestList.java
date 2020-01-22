package com.browserstack.cucumber.steps.globantsummit;

import com.browserstack.cucumber.models.Guest;
import com.browserstack.cucumber.pages.FooterPage;
import com.browserstack.cucumber.pages.ListPage;
import net.thucydides.core.annotations.Step;

public class StepGuestList {


    ListPage listPage;
    @Step
    public void  clickOnLastRecord(){
        listPage.clickOnLastRecord();
    }

    @Step
    public void  checkLastRecord(Guest guest){
        listPage.lastRecordShouldMatch(guest);
    }





}
