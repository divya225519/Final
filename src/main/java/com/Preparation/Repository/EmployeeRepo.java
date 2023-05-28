package com.Preparation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Preparation.Model.Employee;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	

	//int findById(int id);

	//List<Employee> getAllEmployees(List<Employee> getEmps);

	//Employee save(Employee saveEmp);

	//List<Employee> saveAll(List<Employee> saveEmps);

	//int updateOneEmployee(int id);

	//int deleteOneEmployee(int id);

	//List<Employee> getAllEmployees(List<Employee> getEmps);

	//List<Employee> saveAllEmployees(List<Employee> saveEmps);

	//Employee saveOneEmployee(Employee saveEmp);

	//int getOneEmployee(int id);

}
