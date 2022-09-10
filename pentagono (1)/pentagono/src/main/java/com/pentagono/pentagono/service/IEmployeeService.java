package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Employee;

import java.util.List;

public interface IEmployeeService extends ICRUD<Employee, Long> {
  }
 /* List<Employee> findByName(String name);
    List<Employee> findByNameLike(String name);*/