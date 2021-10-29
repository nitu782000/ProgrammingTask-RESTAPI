/*
 The UK DRI Care Research and Technology Centre Programming Task
 
 Spring Rest Controller
 
 Employee Controller
 
 Developed by: Neeta Patel
 Date: 28/10/2021
 */

package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.resourceNotFoundException;
import com.example.demo.model.employee;
import com.example.demo.repository.employeerepository;

@RestController
@RequestMapping("/interview/task/")

public class employeecontroller {
	
	 @Autowired
	 
	 private employeerepository employeerepository;
	
	
	// get employee
	 
	  @GetMapping("/employees")
	    public List<employee> getAllEmployees() {
	        return employeerepository.findAll();
	    }
	// get employee by id
	    
	    @GetMapping("/employees/{id}")
	    public ResponseEntity<employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
	        throws resourceNotFoundException {
	        employee employee = employeerepository.findById(employeeId)
	          .orElseThrow(() -> new resourceNotFoundException("Employee not found for this id :: " + employeeId));
	        return ResponseEntity.ok().body(employee);
	    }
	//save employee
	    
	    @PostMapping("/employees")
	    public employee createEmployee(@RequestBody employee employee) {
	        return employeerepository.save(employee);
	    }

	// update employee
	    
	    @PutMapping("/employees/{id}")
	    public ResponseEntity<employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
	        @RequestBody employee employeeDetails) throws resourceNotFoundException {
	        employee employee = employeerepository.findById(employeeId)
	        .orElseThrow(() -> new resourceNotFoundException("Employee not found for this id :: " + employeeId));

	        employee.setEmp_name(employeeDetails.getEmp_name());
	        employee.setEmp_status(employeeDetails.getEmp_status());
	        employee.setCompleted(employeeDetails.isCompleted());
	        final employee updatedEmployee = employeerepository.save(employee);
	        return ResponseEntity.ok(updatedEmployee);
	    }
	// delete employee
	    
	    @DeleteMapping("/employees/{id}")
	    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
	         throws resourceNotFoundException {
	        employee employee = employeerepository.findById(employeeId)
	       .orElseThrow(() -> new resourceNotFoundException("Employee not found for this id :: " + employeeId));

	        employeerepository.delete(employee);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
	

}
