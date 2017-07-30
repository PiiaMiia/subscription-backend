package com.piiamiia.sib.resources;

import com.codahale.metrics.annotation.Timed;
import com.piiamiia.sib.data.Bill;
import com.piiamiia.sib.database.BillingDB;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/bills")
public class BillingService {

    public BillingService() {
    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bill> getBills() {
        return BillingDB.getAll();
    }
}