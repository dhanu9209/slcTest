package com.slc.dbConnection.dao;

import org.springframework.data.repository.CrudRepository;

import com.slc.dbConnection.modal.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
