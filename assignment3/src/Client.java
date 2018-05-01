package com.pmgardias;

import java.util.ArrayList;

public class Client {

    private int clientID;
    private String clientName;
    ArrayList<Employee> employees;

    public Client(int clientID, String clientName, ArrayList<Employee> employees) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.employees = employees;
    }

    public double totalSales() {
        return 0.0; // TODO
    }

    int getClientID() {
        return clientID;
    }

    void setClientID(int clientID) {
        this.clientID = clientID;
    }

    String getClientName() {
        return clientName;
    }

    void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
