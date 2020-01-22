package com.browserstack.cucumber.models;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class Guest {

    private String name;
    private String email;
    private String city;
    private String address;
    private String state;



}
