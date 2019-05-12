package com.codecool.eventManager;

import com.codecool.eventManager.employees.ChiefManager;
import com.codecool.eventManager.employees.Helper;
import com.codecool.eventManager.employees.Manager;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        hireEmployees(eventManager,20, 6);
        eventManager.simulate();
    }

    public static void hireEmployees(EventManager eventManager, int numOfHelpers, int numOfManagers) {
        for (int i = 0; i < numOfHelpers; i++) {
            eventManager.hireEmployee(new Helper());
        }
        for (int i = 0; i < numOfManagers; i++) {
            if(i >= numOfManagers-1){
                eventManager.hireEmployee(new ChiefManager());
            }else eventManager.hireEmployee(new Manager());
        }
    }
}
