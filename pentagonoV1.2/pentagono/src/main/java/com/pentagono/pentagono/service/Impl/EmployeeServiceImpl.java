package com.pentagono.pentagono.service.Impl;/*Jessica 1sept*/


import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.repository.IEmployeeRepository;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceImpl extends CRUDImpl<Employee, Long> implements IEmployeeService{

    @Autowired
    private IEmployeeRepository repo;

    protected IGenericRepository<Employee, Long> getRepo(){ return repo; }

}

