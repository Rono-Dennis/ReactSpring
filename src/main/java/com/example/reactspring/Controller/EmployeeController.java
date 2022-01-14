package com.example.reactspring.Controller;

import com.example.reactspring.Exceptions.ResourceNotFoundException;
import com.example.reactspring.Model.Employee;
import com.example.reactspring.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin("*")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    //Get all Employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }


    // build create employee REST API
    @PostMapping("/add-employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }


    // build get employee by id REST API
    @GetMapping("/edit-employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id)
    {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id "+ id));
        return ResponseEntity.ok(employee);
    }

    // build update employee  REST API
    @PutMapping("/edit-employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, Employee employeeDetails)
    {
Employee updateEmployee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" + id));

updateEmployee.setFirstName(employeeDetails.getFirstName());
updateEmployee.setLastName(employeeDetails.getLastName());
updateEmployee.setEmail(employeeDetails.getEmail());

employeeRepository.save(updateEmployee);

return ResponseEntity.ok(updateEmployee);
    }
}
