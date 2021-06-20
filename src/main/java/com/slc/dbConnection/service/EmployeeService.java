package com.slc.dbConnection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slc.dbConnection.dao.EmployeeDao;
import com.slc.dbConnection.modal.Employee;

@Service
public class EmployeeService {
    @Autowired
	EmployeeDao employeeDao;
	
    
    public Employee SaveEMployee(Employee emp) {
    return	employeeDao.save(emp);
    }
    
    public List<Employee> getAllEmployees(){
    return	 (List<Employee>) employeeDao.findAll();
    }
    
    
}
