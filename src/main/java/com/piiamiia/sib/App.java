package com.piiamiia.sib;

import com.piiamiia.sib.resources.BillingService;
import com.piiamiia.sib.resources.DetailsService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<Config> {

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void run(Config config, Environment env) {
        final BillingService billingService = new BillingService();
        env.jersey().register(billingService);
        final DetailsService detailsService = new DetailsService();
        env.jersey().register(detailsService);
    }
}