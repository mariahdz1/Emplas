package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.dto.EnterpriseDTO;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.service.IEnterpriseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/enterprises")/*invoca url*/
public class EnterpriseController {

    @Autowired
    private IEnterpriseService service;

    @Autowired
    @Qualifier("enterpriseMapper")
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<EnterpriseDTO>> readAll() throws Exception{
        List<EnterpriseDTO> list = service.readAll().stream()
                .map(e -> mapper.map(e, EnterpriseDTO.class))
                .collect(Collectors.toList());
            return new ResponseEntity <>(list, HttpStatus.CREATED);
    }

    @PostMapping/*verbo HTTP*/
    public Enterprise create(@RequestBody Enterprise enterprise) throws Exception{
        return (Enterprise) service.create(enterprise);
    }


    @GetMapping("/{id}")
    public Enterprise readById(@PathVariable("id") Long id) throws Exception {
        return service.readById(id);
    }

    @PutMapping
    public Enterprise update(@RequestBody Enterprise enterprise) throws Exception {
        return service.update(enterprise);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception{
        service.delete(id);
    }

}
