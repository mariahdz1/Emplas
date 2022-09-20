package com.pentagono.pentagono.repository;

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.Enterprise;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends IGenericRepository<Employee, Long>{
    List<Employee> findByNameLike(String name);

    List<Employee> findByName(String name);


}
