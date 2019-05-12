package com.codecool.eventManager;

import com.codecool.eventManager.employees.Employee;
import com.codecool.eventManager.employees.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventManager implements EventManagerDao {
    private List<Employee> employees = new ArrayList<>();

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void simulate() {
        for (Employee employee : employees) {
            if(employee instanceof Manager){
                ((Manager) employee).organizeEvent(this);
            }
        }
    }

    @Override
    public List<Employee> getFreeEmployee() {
        return employees.stream().filter(Employee::isFree).collect(Collectors.toList());
    }
}
