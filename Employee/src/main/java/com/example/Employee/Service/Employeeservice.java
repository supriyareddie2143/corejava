package com.example.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Repository.Employeerepo;
import com.example.Employee.entity.Employee;

@Service
public class Employeeservice {
	@Autowired
	private Employeerepo pr;
	//create 
	public Employee registorProduct(Employee e)
	{
		return pr.save(e);
		
	}
	// Read
		public List<Employee> getproduct(){
			return (List<Employee> )pr.findAll();
		}
		
		// delete
		
		public void deleteproduct(Integer id) {
			pr.deleteById(id);
		}

}
