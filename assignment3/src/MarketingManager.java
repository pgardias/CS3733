package com.pmgardias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class MarketingManager extends Employee {

    public static final int BONUS_PER_CLIENT = 500;

    private ArrayList<Employee> employees;
    long marketingID;

    public MarketingManager(String employeeName, ArrayList<Employee> employees, MarketingManager manager, long marketingID, HashMap<Integer, Client> clients) {
        super(employeeName, manager, clients);
        this.employees = employees;
        this.marketingID = marketingID;
    }

    protected double bonus() {
        return BONUS_PER_CLIENT * employees.size();
    }

    long getMarketingID() {
        return marketingID;
    }

    void setMarketingID(long marketingID) {
        this.marketingID = marketingID;
    }

    ArrayList<Employee> getEmployees() {
        return employees;
    }

    void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
