package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/enterprises")/*invoca url*/
public class EnterpriseController {

    @Autowired
    private IEnterpriseService service;

    @GetMapping
    public List<Enterprise> readAll() throws Exception{
        return service.readAll();

    }

    @PostMapping/*verbo HTTP*/
    public Enterprise create(@RequestBody Enterprise enterprise) throws Exception{
        return service.create(enterprise);
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
