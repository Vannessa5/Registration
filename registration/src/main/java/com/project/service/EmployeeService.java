package com.project.service;
import com.project.entity.Employee;
import com.project.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService  {

	@Autowired 	
	EmployeeRepository empRepo;
	
	public Employee saveEmployee(Employee emp) {
		empRepo.save(emp);
		return emp;
	}
	
		public Employee getEmployeeByID(Employee emp) {
				
				return empRepo.findById(emp.getId()).get();
			}
		
		public void deleteEmployeeById(Long id) {
		
			empRepo.deleteById(id);
			
		
		}
		
		
	
}
