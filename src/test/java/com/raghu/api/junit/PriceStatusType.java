package com.raghu.api.junit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceStatusType {
    @JsonProperty
    private String priceStatusCode;

    @JsonProperty
    private String priceStatusDesc;

    public String getPriceStatusCode() {
        return priceStatusCode;
    }

    public void setPriceStatusCode(String priceStatusCode) {
        this.priceStatusCode = priceStatusCode;
    }

    public String getPriceStatusDesc() {
        return priceStatusDesc;
    }

    public void setPriceStatusDesc(String priceStatusDesc) {
        this.priceStatusDesc = priceStatusDesc;
    }
}
