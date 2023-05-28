package com.Preparation.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Preparation.Model.Employee;
import com.Preparation.Service.EmployeeService;
//@PropertySource("classpath:application11.properties")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	@Autowired
	ConfigurationsClassDatasource source;
	@Autowired
	//@Qualifier("doggy")
	Animal animal;
     @Value("${nagu}")
     String naguValue;
     
     private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
     @GetMapping("/barking")
     public String barking() {
    	 System.out.println(">>>>>>>>>>>>"+source.getUsername()+source.getPassword());
    	 return animal.bark();
     }
	@GetMapping("/getOneEmployee/{id}")
	public Optional<Employee> getOneEmployee(@PathVariable ("id") int EmpId) {
		System.out.println("get one employee details"+naguValue);
		log.info("get one employee detials"+EmpId);
	    //log.info("To fetch one employee record based on empId is.."+ EmpId);

		return empservice.getOneEmployee(EmpId);
	}
	@GetMapping("/getAllEmloyees")
	public List<Employee> getAllEmloyees() {
		return empservice.getAllEmployees();
	}
	@PostMapping("/saveOneEmployee")
	public Employee saveOneEmployee(@RequestBody Employee emp) {
		System.out.println("?????????????????"+emp);
		return empservice.saveOneEmployee(emp);
	}
	
	@PostMapping("/saveAllEmployees")
	public List<Employee> saveAllEmployees(@RequestBody List<Employee> emps){
		return empservice.saveAllEmployees(emps);
	}
	@PutMapping("/updateEmployee/{id}")
	public void updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
		empservice.updateOneEmployee(id, emp);
	}
	@PatchMapping("/updateEmployeePatch/{id}")
	public void updateEmployeePatch(@PathVariable int id, @RequestBody Employee emp) {
		System.out.println("id="+id+"....."+emp);
		empservice.updateOneEmployeePatch(id, emp);
	}
}
