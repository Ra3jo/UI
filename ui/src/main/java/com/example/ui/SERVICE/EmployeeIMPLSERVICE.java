package com.example.ui.SERVICE;

import com.example.ui.ENTITY.Employee;
import com.example.ui.REPOSITORY.EmployeeREPOSITORY;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeIMPLSERVICE implements EmployeeSERVICES{
  private EmployeeREPOSITORY employeeREPOSITORY;
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeREPOSITORY.save(employee);

    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        Optional<Employee>optionalEmployee=employeeREPOSITORY.findById(employeeId);

        return optionalEmployee.get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeREPOSITORY.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee=employeeREPOSITORY.findById(employee.getId()).get();
        existingEmployee.setMname(employee.getMname());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setFname(employee.getFname());
        existingEmployee.setLname(employee.getLname());
        Employee updatedEmployee=employeeREPOSITORY.save(existingEmployee);
        return updatedEmployee;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeREPOSITORY.deleteById(employeeId);

    }
}
