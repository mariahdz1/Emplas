package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.repository.IEmployeeRepository;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl extends CRUDImpl<Employee, Long> implements IEmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Autowired
    private IEmployeeRepository repo;

   /* public List<Employee> getAllEmployees() {return (List<Employee>) this.iEmployeeRepository.findAll();}*/

    public List<Employee> getAllEmployees(){
        List<Employee> empleadoList= new ArrayList<>();
        iEmployeeRepository.findAll().forEach(employee -> empleadoList.add(employee));
        return empleadoList;
    }

    //Metodo para guardar o actualizar registros en Empleados
    public boolean saveOrUpdateEmployee(Employee empl){
        Employee emp=iEmployeeRepository.save(empl);
        if (iEmployeeRepository.findById(emp.getIdEmployee())!=null){
            return true;
        }
        return false;
    }

    //Metodo para eliminar un registro de Empleado por Id
    public boolean deleteEmployee(Long id){
        iEmployeeRepository.deleteById(id);
        if(this.iEmployeeRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }

    @Override
    public List<Employee> obtenerPorEmpresa(Long idEmployee) {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) { }


    @Override
    public Employee getEmployeeById(long id) {
        return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {

    }

    @Override
    public Employee createEmployee(Employee employee) {
        return this.iEmployeeRepository.save(employee);
    }

    @Override
    public boolean saveOrUpdateEmpleado(Employee empl) {
        return false;
    }

    @Override
    protected IGenericRepository<Employee, Long> getRepo() {
        return null;
    }


}


















/*

    @Override
    protected IGenericRepository<Employee, Long> getRepo(){ return repo; }

    @Override
    public void saveEmployee(Employee employee) { }


    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee>optional=iEmployeeRepository.findById(id);
        Employee employee=null;
        if (optional.isPresent()){
            employee=optional.get();
        } else{
            throw  new RuntimeException("El empleado con el id "+id+"no fue encontrado en la base de datos");
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        this.iEmployeeRepository.deleteById(id);
    }



    /*metodos nuevos archivados

    @Override
    public List<Employee> findByName(String name) {
        return repo.findByName(name);
    }


    @Override
    public Employee create(Employee employee) {
        return this.iEmployeeRepository.save(employee);
    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSiza, String sortField, String sortDirection) {
        return null;
    }*/




