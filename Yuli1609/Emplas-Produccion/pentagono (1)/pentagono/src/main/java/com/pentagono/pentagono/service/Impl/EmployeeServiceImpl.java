package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.repository.IEmployeeRepository;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl extends CRUDImpl<Employee, Long> implements IEmployeeService {
    @Autowired
    private IEmployeeRepository repo;

    @Override
    protected IGenericRepository<Employee, Long> getRepo(){ return repo; }

    @Override
    public List<Employee> findByName(String name) {
        return repo.findByName(name);
    }

    @Override
    public List<Employee> findByNameLike(String name) {
        return null;
    }

}
