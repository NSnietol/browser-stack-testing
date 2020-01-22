package com.browserstack.cucumber.pages;

import com.browserstack.cucumber.models.Guest;
import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ListPage extends PageObject {

    @FindBy( id = "name")
    List<WebElementFacade> names;

    @FindBy(id = "email")
    List<WebElementFacade> emails;

    @FindBy(id = "address")
    List<WebElementFacade> addresses;

    @FindBy(id = "city")
    List<WebElementFacade> cities;

    @FindBy(id = "state")
    List<WebElementFacade> states;




    public Guest getGuestIn(int posicion){
       return Guest.builder()
                .name(names.get(posicion).getText())
                .email(emails.get(posicion).getText())
                .address(addresses.get(posicion).getText())
                .city(cities.get(posicion).getText())
                .state(states.get(posicion).getText())
                .build();
    }

    public int totalRecords(){
        return names.size();
    }


    public void lastRecordShouldMatch(Guest currentGuest){
        assertThat(getGuestIn(totalRecords()-1)).isEqualTo(currentGuest);
    }

    public void clickOnLastRecord(){
        names.get(this.totalRecords()-1).click();
    }

}
