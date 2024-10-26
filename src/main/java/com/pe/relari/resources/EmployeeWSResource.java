package com.pe.relari.resources;

import com.pe.relari.model.Employee;
import com.pe.relari.service.EmployeeService;
import com.pe.relari.service.impl.EmployeeServiceImpl;
import com.pe.relari.util.GenderCatalog;
import com.pe.relari.util.PositionCatalog;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

/**
 * @author Relari
 */

@WebService(serviceName = "EmployeeWSResource", targetNamespace = "http://github.com/Relari")
public class EmployeeWSResource {

    private static final EmployeeService employeeService = EmployeeServiceImpl.getInstance();

    @WebMethod(operationName = "save")
    public Employee save(
            @WebParam(name = "name") String name,
            @WebParam(name = "age") Integer age,
            @WebParam(name = "gender") GenderCatalog gender,
            @WebParam(name = "position") PositionCatalog position,
            @WebParam(name = "salary") Integer salary) {
        return Employee.builder()
                .id(1)
                .name(name)
                .age(age)
                .gender(gender)
                .position(position)
                .salary(salary)
                .status(Boolean.TRUE)
                .build();
    }

    @WebMethod(operationName = "employees")
    public List<Employee> employees() {
        return employeeService.getEmployees();
    }


}
