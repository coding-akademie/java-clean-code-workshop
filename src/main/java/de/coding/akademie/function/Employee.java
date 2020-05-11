package de.coding.akademie.function;

import java.util.LinkedList;
import java.util.List;

public class Employee {

    private String name;
    private double salary;

    List<String> group = new LinkedList<>();

 // Zustand eines Objekts = der momentane Wertbelegung der Instanzvariablen
    // Employee employee =  Employee("Andrea", 50.000)
    // Side-effect => ändert den Zustand!
    // Ändert den Zustand => modifiziert eine Instanzvariable

    public double raiseSalary(double percent){
        double raised = salary * percent;
        salary = salary + raised;
        return salary;
    }


    public boolean addToGroup(String name){
        return group.add(name);
    }

    public void raiseSalary2(double percent){
        double raised = salary * percent;
        salary = salary + raised;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
