package com.pentagono.pentagono.repository;/*Jessica 1 sept*/


import com.pentagono.pentagono.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IEmployeeRepository extends IGenericRepository<Employee,Long> {

}
