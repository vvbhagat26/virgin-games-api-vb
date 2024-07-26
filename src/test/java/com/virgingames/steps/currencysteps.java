package com.virgingames.steps;

import com.virgingames.model.CurrencyPojo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

public class currencysteps {

    static ValidatableResponse response;

    @Steps
    CurrencyPojo steps;

    @When("I send specific {string} endpoint")
    public void iSendSpecificEndpoint(String currency) {

            if (currency.equalsIgnoreCase("GBP")) {
                response = steps.getAllGBP();
            } else if (currency.equalsIgnoreCase("EUR")) {
                response = steps.getAllEUR();
            } else if (currency.equalsIgnoreCase("SEK")) {
                response = steps.getAllSEK();
            }
    }

    @Then("I should get {int} status code")
    public void iShouldGetStatusCode(int statusCode) {
        response.statusCode(statusCode);
    }
}
