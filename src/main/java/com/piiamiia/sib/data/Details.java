package com.piiamiia.sib.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Details {
    private String nextDate;
    private String serviceType;
    private String serviceProvider;

    public Details(String nextDate, String serviceType, String serviceProvider) {
        this.nextDate = nextDate;
        this.serviceType = serviceType;
        this.serviceProvider = serviceProvider;
    }

    @JsonProperty
    public String getNextDate() {
        return nextDate;
    }

    @JsonProperty
    public String getServiceType() {
        return serviceType;
    }

    @JsonProperty
    public String getServiceProvider() {
        return serviceProvider;
    }
}
