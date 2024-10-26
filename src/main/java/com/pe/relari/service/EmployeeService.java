package com.pe.relari.service;

import com.pe.relari.model.Employee;

import java.util.List;

/**
 * @author Relari
 */

public interface EmployeeService {

    List<Employee> getEmployees();

    void removeEmployee(Integer id);

    void addEmployee(Employee employee);

    Employee searchEmployee(Integer id);
}
