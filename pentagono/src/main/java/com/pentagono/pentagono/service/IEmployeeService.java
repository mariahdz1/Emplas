package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IEmployeeService extends ICRUD<Employee, Long> {


  /*codigo nuevo*/
  List<Employee> getAllEmployees();
  void saveEmployee(Employee employee);
  Employee getEmployeeById(long id);
  void deleteEmployeeById(Long id);


  Employee createEmployee(Employee employee);
}
