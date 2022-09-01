package com.pentagono.pentagono.service;/*jessica 1 sept*/

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.Enterprise;

import java.util.List;

public interface IEmployeeService extends ICRUD<Enterprise, Long>{
    List<Employee> findByName(String name);
}
