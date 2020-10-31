package com.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Employee;
import com.project.repository.EmployeeRepository;
import com.project.service.EmployeeService;

@Component
@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private EmployeeService empService;
		
		@CrossOrigin
		@PostMapping("addEmployee")
		public Employee saveEmployee(@RequestBody Employee employee) {
			
			return empService.saveEmployee(employee);
		}
		
		
		@DeleteMapping("/deleteEmployee/{id}")
		public void deleteEmployee(@PathVariable Long id) {
			
			empService.deleteEmployeeById(id);
		}
		
}
