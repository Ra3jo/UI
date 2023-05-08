package com.example.ui.REPOSITORY;

import com.example.ui.ENTITY.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeREPOSITORY extends JpaRepository<Employee,Long> {
}
