package edu.guvi.employee.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.guvi.employee.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee , String > {
    
}
