package com.raghu.api.junit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasureType {
    @JsonProperty
    private String measureCode;

    @JsonProperty
    private String measureDesc;

    public String getMeasureCode() {
        return measureCode;
    }

    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    public String getMeasureDesc() {
        return measureDesc;
    }

    public void setMeasureDesc(String measureDesc) {
        this.measureDesc = measureDesc;
    }
}
