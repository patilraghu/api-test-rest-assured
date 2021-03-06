package com.raghu.api.junit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PricePeriodType {
    @JsonProperty
    private String pricePeriodCode;

    @JsonProperty
    private String pricePeriodDesc;

    public String getPricePeriodCode() {
        return pricePeriodCode;
    }

    public void setPricePeriodCode(String pricePeriodCode) {
        this.pricePeriodCode = pricePeriodCode;
    }

    public String getPricePeriodDesc() {
        return pricePeriodDesc;
    }

    public void setPricePeriodDesc(String pricePeriodDesc) {
        this.pricePeriodDesc = pricePeriodDesc;
    }
}
