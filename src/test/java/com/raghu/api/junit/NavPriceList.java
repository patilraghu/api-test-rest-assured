package com.raghu.api.junit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NavPriceList {
    @JsonProperty
    private String portId;

    @JsonProperty
    public NavPriceArray[] navPriceArray;

    public String getPortId(){
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }
}
