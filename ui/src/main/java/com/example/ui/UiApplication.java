package com.example.ui;

import com.example.ui.ENTITY.Employee;
import com.example.ui.REPOSITORY.EmployeeREPOSITORY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}
    @Autowired
	private EmployeeREPOSITORY employeeREPOSITORY;
	@Override
	public void run(String... args) throws Exception {
		Employee employee= new Employee();
		employee.setEmail("www.rbej@gmail.com");
		employee.setFname("raban");
		employee.setMname("Evaristo");
		employee.setLname("Joseph");
		employeeREPOSITORY.save(employee);



	}
}
