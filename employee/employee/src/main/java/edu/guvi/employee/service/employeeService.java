package edu.guvi.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.guvi.employee.Repository.EmployeeRepo;
import edu.guvi.employee.model.Employee;

@Service
public class employeeService {

    @Autowired
    EmployeeRepo employeeRepo;


    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepo.findById(id);
    }


    
}
