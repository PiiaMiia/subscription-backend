package com.piiamiia.sib.resources;

import com.codahale.metrics.annotation.Timed;
import com.piiamiia.sib.data.Details;
import com.piiamiia.sib.database.DetailsDB;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/details")
public class DetailsService {

    public DetailsService() {
    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public Details getDetails() {
        return DetailsDB.getDetails();
    }

    @DELETE
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public Details cancelSubscription() {
        Details empty = new Details("","Free","GO Service");
        DetailsDB.setDetails(empty);
        return getDetails();
    }

    @POST
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public Details restoreSubscription() {
        Details empty = new Details("May 13, 2017", "Premium account for €2.99/month","GO Service");
        DetailsDB.setDetails(empty);
        return getDetails();
    }
}