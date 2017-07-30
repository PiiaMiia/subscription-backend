package com.piiamiia.sib;

import com.codahale.metrics.health.HealthCheck;
import com.piiamiia.sib.database.BillingDB;

public class RestHealthCheck extends HealthCheck {

    private final String version;

    public RestHealthCheck(String version) {
        this.version = version;
    }

    @Override
    protected Result check() throws Exception {
        if (BillingDB.getCount() == 0) {
            return Result.unhealthy("No bills in DB! Version: " +
                    this.version);
        }
        return Result.healthy("OK with version: " + this.version +
                ". Persons count: " + BillingDB.getCount());
    }
}
