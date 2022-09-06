package com.pentagono.pentagono.repository;


import com.pentagono.pentagono.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends IGenericRepository<Employee,Long> {

        /*Optional<Employee> findById(Long idEmployee);*/
}
