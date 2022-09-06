package com.pentagono.pentagono.controller;/*Jessica 1 sept*/

import com.pentagono.pentagono.dto.EmployeeDTO;
import com.pentagono.pentagono.exceptions.ModelNotFoundException;
import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.service.IEmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService service;

    @Autowired
    @Qualifier("employeeMapper")
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> readAll() throws Exception{
        List<EmployeeDTO> list = service.readAll().stream()
                .map(c -> mapper.map(c, EmployeeDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> create(@Valid @RequestBody EmployeeDTO employeeDto) throws Exception{
        Employee empl = service.create(mapper.map(employeeDto,Employee.class));
        EmployeeDTO dto = mapper.map(empl,EmployeeDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")

    public ResponseEntity<EmployeeDTO> readById(@PathVariable("id") Long idEmployee) throws Exception{
        Employee empl = service.readById(idEmployee);
        if(empl == null){
            throw new ModelNotFoundException("Id del Empleado Nº: " + idEmployee + " No fue encontrado");
        }
        EmployeeDTO dto = mapper.map(empl, EmployeeDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<EmployeeDTO> update(@Valid @RequestBody EmployeeDTO employeeDto) throws Exception{
        Employee empl = service.readById(employeeDto.getIdEmployee());
        if(empl == null){
            throw new ModelNotFoundException("Id del Empleado no encontrado: " + employeeDto.getIdEmployee());
        }
        Employee employee = service.update(mapper.map(employeeDto, Employee.class));
        EmployeeDTO dto = mapper.map(employee, EmployeeDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception{
        Employee empl = service.readById(id);
        if(empl == null){
            throw new ModelNotFoundException("Id del Empleado no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
