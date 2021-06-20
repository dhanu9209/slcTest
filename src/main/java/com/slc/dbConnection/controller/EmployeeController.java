package com.slc.dbConnection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slc.dbConnection.modal.Employee;
import com.slc.dbConnection.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
	EmployeeService empService;
	
	@PostMapping
    public Employee addingEmployee(@RequestBody Employee emp) {
	return	empService.SaveEMployee(emp);
    }
    @GetMapping
	public List<Employee> gettingAllEmployees(){
	return	empService.getAllEmployees();
	}
	
	
}
