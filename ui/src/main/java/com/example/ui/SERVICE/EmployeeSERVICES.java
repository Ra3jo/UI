package com.example.ui.SERVICE;

import com.example.ui.ENTITY.Employee;

import java.util.List;

public interface EmployeeSERVICES {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(Long  employeeId);
    List<Employee>getAllEmployee();
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long employeeId);
}
