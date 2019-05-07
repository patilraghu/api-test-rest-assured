package com.raghu.api.junit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NavPriceList {
    @JsonProperty
    String portId;

    @JsonProperty
    NavPriceArray[] navPriceArray;

    public String getPortId(){
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }
}
