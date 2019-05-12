package com.codecool.eventManager.employees;

public abstract class Employee {
    private static int idCounter = 1;
    protected int id;
    protected boolean isFree = true;

    public boolean isFree() {
        return isFree;
    }

    public Employee() {
        this.id = idCounter++;
    }
}
