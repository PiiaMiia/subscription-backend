package com.piiamiia.sib.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bill {
    private int id;
    private String date;
    private String period;
    private String currency;
    private String total;

    public Bill(int id, String date, String period, String currency, String total) {
        this.id = id;
        this.date = date;
        this.period = period;
        this.currency = currency;
        this.total = total;
    }

    @JsonProperty
    public int getId() {
        return id;
    }

    @JsonProperty
    public String getDate() {
        return date;
    }

    @JsonProperty
    public String getPeriod() {
        return period;
    }

    @JsonProperty
    public String getCurrency() {
        return currency;
    }

    @JsonProperty
    public String getTotal() {
        return total;
    }
}