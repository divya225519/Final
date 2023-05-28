package com.Preparation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Preparation.Model.Employee;
import com.Preparation.Repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo empRepo;

	public Optional<Employee> getOneEmployee(int id) {
		return empRepo.findById(id);
		
	}
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	public Employee saveOneEmployee(Employee saveEmp) {
		return empRepo.save(saveEmp);
	}

	public List<Employee> saveAllEmployees(List<Employee> saveEmps) {
		
		return empRepo.saveAll(saveEmps);
	}

	
	 public void updateOneEmployee(int id, Employee newData) {
		
		 Employee old = empRepo.getById(id);
		
		 if(newData.getEmpId()==old.getEmpId())///old data from database
		 {
		 Employee updatedData = new Employee();//here default values are there.
		 updatedData.setEmpId(newData.getEmpId());
		 if(newData.getEmpName()!=null)
	 {
	 updatedData.setEmpName(newData.getEmpName());
	 }
//		 else
//			 updatedData.setEmpName(old.getEmpName());
//			 
	 if(newData.getEmpSalary()>0.0f)
		 {
		 updatedData.setEmpSalary(newData.getEmpSalary());
		 }
//		 else
//			 updatedData.setEmpSalary(old.getEmpSalary());
//			 
		 
	 
	  empRepo.save(updatedData);
		 }
	  }
	 public void updateOneEmployeePatch(int id, Employee newData) {
		 Employee old = empRepo.getById(id);
		 if(newData.getEmpId()==old.getEmpId())///old data from database
		 {
		 Employee updatedData = new Employee();//here default values are there.
		 updatedData.setEmpId(newData.getEmpId());
		 if(newData.getEmpName()!=null) {
			 updatedData.setEmpName(newData.getEmpName());
		 }
		 else
			 updatedData.setEmpName(old.getEmpName());
		 if(newData.getEmpSalary()>0.0f) {
			 updatedData.setEmpSalary(newData.getEmpSalary());
		 }
		 else
		 updatedData.setEmpSalary(old.getEmpSalary());
			 

		 empRepo.save(updatedData);
		 }
	 }
	 

	public void deleteOneEmployee(int id) {
		
		 empRepo.deleteById(id);
	}
	

}
