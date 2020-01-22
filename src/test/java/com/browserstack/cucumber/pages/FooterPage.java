package com.browserstack.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


@DefaultUrl("page:home.page")
public class FooterPage extends PageObject {

    @FindBy(id = "loading")
    WebElementFacade loadingMessage;



    public void waitForLoadedPage(){

        if(loadingMessage.isCurrentlyVisible())
            waitForCondition().withTimeout(45, TimeUnit.SECONDS)
                    .until(ExpectedConditions
                            .invisibilityOf(loadingMessage));


    }




}
