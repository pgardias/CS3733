package com.pmgardias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Clients
        Client tim = new Client(3, "Tim", new ArrayList());
        Client bob = new Client(9, "Bob", new ArrayList());
        Client jerry = new Client(42, "Janet", new ArrayList());

        // Marketing Associates
        MarketingAssociate peter = new MarketingAssociate("Peter", null, 145, new HashMap<>());
        MarketingAssociate jim = new MarketingAssociate("Jim", null, 204, new HashMap<>());
        MarketingAssociate janet = new MarketingAssociate("Janey", null, 100, new HashMap<>());

        // Marketing Managers
        MarketingManager mary = new MarketingManager("Mary", new ArrayList(Arrays.asList(jim, janet)), null, 74, new HashMap<>());
        MarketingManager john = new MarketingManager("John", new ArrayList(Arrays.asList(peter, mary)), null, 34, new HashMap<>());
        mary.addClient(tim);
        mary.addClient(jerry);
        john.addClient(bob);


        // Setting additional fields which could not be filled due to ordering
        mary.manager = john;
        peter.manager = john;
        jim.manager = mary;
        janet.manager = mary;
        tim.employees.add(mary);
        bob.employees.add(john);
        jerry.employees.add(mary);

        int i = 0;
        // Output
        System.out.print("Marketing Manager: " + john.employeeName + ". Employees: " + john.getEmployees().get(0).employeeName + ", " + john.getEmployees().get(1).employeeName + ". Clients: ");
        for (Client c : john.getClients()) {
            System.out.print(c.getClientID());
            if (i++ != john.getClients().size() - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
                i = 0;
                break;
            }
        }
        System.out.println();
        System.out.print("Marketing Manager: " + mary.employeeName + ". Employees: " + mary.getEmployees().get(0).employeeName + ", " + mary.getEmployees().get(1).employeeName + ". Clients: ");
        for (Client c : mary.getClients()) {
            System.out.print(c.getClientID());
            if (i++ != mary.getClients().size() - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
                i = 0;
                break;
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Employee: " + peter.employeeName + ". Marketing Manager: " + peter.manager.employeeName + ".");
        System.out.println("Employee: " + jim.employeeName + ". Marketing Manager: " + jim.manager.employeeName + ".");
        System.out.println("Employee: " + janet.employeeName + ". Marketing Manager: " + janet.manager.employeeName + ".");
        System.out.println();

        System.out.println("ClientID: " + tim.getClientID() + ". Marketing Employee: " + tim.employees.get(0).employeeName);
        System.out.println("ClientID: " + bob.getClientID() + ". Marketing Employee: " + bob.employees.get(0).employeeName);
        System.out.println("ClientID: " + jerry.getClientID() + ". Marketing Employee: " + jerry.employees.get(0).employeeName);
    }
}
