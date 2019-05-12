package com.codecool.eventManager;

import com.codecool.eventManager.employees.Employee;

import java.util.List;

public interface EventManagerDao {
    List<Employee> getFreeEmployee();
}
