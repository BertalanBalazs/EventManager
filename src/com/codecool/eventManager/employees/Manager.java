package com.codecool.eventManager.employees;

import com.codecool.eventManager.Event;
import com.codecool.eventManager.EventManager;
import com.codecool.eventManager.EventManagerDao;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Manager extends Employee {
    public void organizeEvent(EventManager eventManager) {
        EventManagerDao eventManagerDao = eventManager;
        List<Employee> freeHelpers = eventManagerDao.getFreeEmployee().stream()
                .filter(employee -> employee instanceof Helper && employee.isFree).collect(Collectors.toList());

        if(freeHelpers.size() >= 10){
            Event event = Event.values()[new Random().nextInt(Event.values().length)];
            for (int i = 0; i < 10; i++) {
                Helper helper = (Helper) freeHelpers.get(i);
                helper.onEvent(event);
            }
        }
    }
}
