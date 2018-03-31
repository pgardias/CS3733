package com.pmgardias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class MarketingAssociate extends Employee {

    public static final int BONUS_PER_CLIENT = 250;

    long marketingID;

    public MarketingAssociate(String employeeName, MarketingManager manager, long marketingID, HashMap<Integer, Client> clients) {
        super(employeeName, manager, clients);
        this.marketingID = marketingID;
    }

    protected double bonus() {
        return BONUS_PER_CLIENT * clients.size();
    }

    long getMarketingID() {
        return marketingID;
    }

    void setMarketingID(long marketingID) {
        this.marketingID = marketingID;
    }
}
