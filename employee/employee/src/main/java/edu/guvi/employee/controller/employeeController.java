package edu.guvi.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.guvi.employee.Repository.EmployeeRepo;
import edu.guvi.employee.model.Employee;
import edu.guvi.employee.service.employeeService;

@RestController
@RequestMapping("/Employee")
@CrossOrigin(origins = "*")
public class employeeController {

    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    employeeService EmployeeService;

     @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return EmployeeService.saveEmployee(employee);
    }


     @GetMapping
    public ResponseEntity<?> getAllEmployees(@RequestParam(required = false) String id) {
         return ResponseEntity.ok(EmployeeService.getAllEmployees());
    }

     @GetMapping("{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return EmployeeService.getEmployeeById(id);
    }

    
}
