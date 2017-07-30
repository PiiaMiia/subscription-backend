package com.piiamiia.sib.database;

import com.piiamiia.sib.data.Bill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingDB {
    private static Map<Integer, Bill> bills = new HashMap<Integer, Bill>();

    static {
        bills.put(1, new Bill(1, "13.04.17", "13.04.17-12.05.17", "EUR", "2.99"));
        bills.put(2, new Bill(2, "12.03.17", "12.03.17-12.04.17", "EUR", "2.99"));
        bills.put(3, new Bill(3, "12.02.17", "12.02.17-12.03.17", "EUR", "2.99"));
    }


    public static List<Bill> getAll() {
        List<Bill> result = new ArrayList<Bill>();
        for (Integer key : bills.keySet()) {
            result.add(bills.get(key));
        }
        return result;
    }

    public static int getCount() {
        return bills.size();
    }
}