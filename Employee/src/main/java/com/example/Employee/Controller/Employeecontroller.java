package com.example.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.Service.Employeeservice;
import com.example.Employee.entity.Employee;

@RestController
public class Employeecontroller {
	@Autowired
	private Employeeservice ps;
	@PostMapping("/Employee")
	public Employee registerproduct(@RequestBody Employee p) {
		return ps.registorProduct(p);
	}
	@GetMapping("/Employee")
	public List<Employee>getproduct(){
		return ps.getproduct();
	}
@DeleteMapping("/Employee/{id}")
public void deleteproduct(@PathVariable("id") Integer id) {
ps.deleteproduct(id);
}
}
