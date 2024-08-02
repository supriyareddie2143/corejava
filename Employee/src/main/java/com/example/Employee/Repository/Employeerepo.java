package com.example.Employee.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Employee.entity.Employee;

public interface Employeerepo extends CrudRepository<Employee,Integer>{

}
