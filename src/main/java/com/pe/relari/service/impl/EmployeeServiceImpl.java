package com.pe.relari.service.impl;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.service.EmployeeService;
import org.jboss.logging.Logger;

import java.util.List;

/**
 * @author Relari
 */

public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger logger = Logger.getLogger(EmployeeServiceImpl.class.getName());

    private EmployeeServiceImpl() {}

    private static EmployeeService employeeService = null;

    public static EmployeeService getInstance() {
        if (employeeService == null) {
            employeeService = new EmployeeServiceImpl();
        }
        return employeeService;
    }

    private static final List<Employee> employees = EmployeeRepository.employees();

    public List<Employee> getEmployees() {
    	logger.info("Listando empleados");
        return employees;
    }

    public void removeEmployee(Integer id) {
        logger.infof("Eliminando el empleado con el ID = %s", id);
        employees.removeIf(employee -> employee.getId().equals(id));
    }

    @Override
    public void addEmployee(Employee employee) {
    	logger.info("Agregado al nuevo empleado.");
        employees.add(employee);
    }

    @Override
    public Employee searchEmployee(Integer id) {
    	logger.infof("Buscar al empleado por el ID = %s", id);
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee Not Found"));
    }
}

