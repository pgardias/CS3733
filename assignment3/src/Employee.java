package com.pmgardias;

import java.util.ArrayList;
import java.util.HashMap;

abstract class Employee {

    String employeeName;
    MarketingManager manager;
    HashMap<Integer, Client> clients;

    public Employee(String employeeName, MarketingManager manager, HashMap<Integer, Client> clients) {
        this.employeeName = employeeName;
        this.manager = manager;
        this.clients = clients;
    }

    public final Boolean addClient(Client c) {
        Boolean flag = Boolean.FALSE;
        Client check = clients.put(c.getClientID(), c);
        if (check == null) {
            flag = Boolean.TRUE;
        }
        return flag;
    }
    public final ArrayList<Client> getClients() {
        return new ArrayList<>(clients.values());
    }
    /*
     * Protected has same functionality as private, and bonus() is implemented as
     * abstract in the Employee class as both MarketingManager and MarketingAssociate
     * contain the method.
     */
    protected abstract double bonus();
}
