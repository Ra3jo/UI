package com.example.ui.CONTROLLER;

import com.example.ui.ENTITY.Employee;
import com.example.ui.REPOSITORY.EmployeeREPOSITORY;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/Employee")
public class EmployeeCONTROLLER {
    @Autowired
    private EmployeeREPOSITORY employeeREPOSITORY;
    @GetMapping
    public List<Employee>getAllEmployees(){
        return employeeREPOSITORY.findAll();
    }
    //build create EMPLOYEE API
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeREPOSITORY.save(employee);
    }


}
