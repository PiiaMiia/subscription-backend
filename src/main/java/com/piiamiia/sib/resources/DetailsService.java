package com.piiamiia.sib.resources;

import com.codahale.metrics.annotation.Timed;
import com.piiamiia.sib.data.Details;
import com.piiamiia.sib.database.DetailsDB;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
}