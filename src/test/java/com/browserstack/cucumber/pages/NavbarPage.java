package com.browserstack.cucumber.pages;

import com.browserstack.cucumber.models.Guest;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("page:home.page")
public class NavbarPage extends PageObject {

    @FindBy(id = "form")
    WebElementFacade formOption;

    @FindBy(id = "guestList")
    WebElementFacade listOption;



    public void clickOnList(){
        listOption.click();

    }





}
