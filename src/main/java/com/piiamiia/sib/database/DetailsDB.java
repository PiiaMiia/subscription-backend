package com.piiamiia.sib.database;

import com.piiamiia.sib.data.Details;

public class DetailsDB {
    private static Details details = new Details("May 13, 2017", "Premium account for €2.99/month", "GO Server");

    public static Details getDetails() {
        return details;
    }
}