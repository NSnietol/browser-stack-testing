package com.browserstack.cucumber.pages;

import com.browserstack.cucumber.models.Guest;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;



@DefaultUrl("https://quality-summit-glb.herokuapp.com")
public class InitForm extends PageObject {

    @FindBy(id = "inputName")
    WebElementFacade name;

    @FindBy(id = "inputEmail")
    WebElementFacade email;

    @FindBy(id = "inputAddress")
    WebElementFacade address;

    @FindBy(id = "inputCity")
    WebElementFacade city;

    @FindBy(id = "inputState")
    WebElementFacade state;

    @FindBy(xpath = "//*[text()='Accept']")
    WebElementFacade acceptBtn;



    public void fillForm(Guest guest){
         name.sendKeys(guest.getName());

        email.sendKeys(guest.getEmail());

        city.sendKeys(guest.getCity());

        address.sendKeys(guest.getAddress());

        state.sendKeys(guest.getState());

    }

    public void submitForm(){
        acceptBtn.click();

    }



}
