package com.virgingames.model;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class CurrencyPojo {


    @Step("Getting all data with currency GBP")
    public ValidatableResponse getAllGBP(){
        return SerenityRest.given().log().all()
                .queryParam("Currency","GBP")
                .when()
                .get()
                .then().log().all();
    }
    @Step("Getting all data with currency EUR")
    public ValidatableResponse getAllEUR() {
        return SerenityRest.given().log().all()
                .queryParam("currency", "EUR")
                .when()
                .get()
                .then().log().all();
    }

    @Step("Getting all data with currency SEK")
    public ValidatableResponse getAllSEK() {
        return SerenityRest.given().log().all()
                .queryParam("currency", "SEK")
                .when()
                .get()
                .then().log().all();
    }

}
