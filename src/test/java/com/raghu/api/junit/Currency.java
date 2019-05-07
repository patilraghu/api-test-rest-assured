package com.raghu.api.junit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {
    @JsonProperty
    String currencyCode;

    @JsonProperty
    String currencyLocation;

    @JsonProperty
    String currencySymbol;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyLocation() {
        return currencyLocation;
    }

    public void setCurrencyLocation(String currencyLocation) {
        this.currencyLocation = currencyLocation;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }
}
