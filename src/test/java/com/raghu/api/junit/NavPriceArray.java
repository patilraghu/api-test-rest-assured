package com.raghu.api.junit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class NavPriceArray {
    @JsonProperty
    private double amountChange;

    @JsonProperty
    private String asOfDate;

    @JsonProperty
    public Currency currency;

    @JsonProperty
    private boolean isFinal;

    @JsonProperty
    public MeasureType measureType;

    @JsonProperty
    private double percentChange;

    @JsonProperty
    private double price;

    @JsonProperty
    public PricePeriodType pricePeriodType;

    @JsonProperty
    public PriceStatusType priceStatusType;

    @JsonProperty
    public Yield yield;

    @JsonProperty
    private boolean Final;

    public double getAmountChange() {
        return amountChange;
    }

    public void setAmountChange(double amountChange) {
        this.amountChange = amountChange;
    }

    public String getAsOfDate() {
        return asOfDate;
    }

    public void setAsOfDate(String asOfDate) {
        this.asOfDate = asOfDate;
    }

    public boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getFinal() {
        return Final;
    }

    public void setFinal(boolean Final) {
        this.Final = Final;
    }
}
