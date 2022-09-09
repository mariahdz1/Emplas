package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.dto.EnterpriseDTO;
import com.pentagono.pentagono.exceptions.ModelNotFoundException;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.service.IEnterpriseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/enterprises")
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
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception{
        Enterprise ent = service.readById(id);
        if(ent == null){
            throw new ModelNotFoundException("Id no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/find/name/{param}")
    public ResponseEntity<List<EnterpriseDTO>> findByName(@PathVariable("param") String param) throws Exception
    {
        List<EnterpriseDTO> list = service.findByName(param).stream()
                .map(c -> mapper.map(c, EnterpriseDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    /*@GetMapping("/find/name/like/{param}")
    public ResponseEntity<List<EnterpriseDTO>> findByNameLike(@PathVariable("param") String param) throws Exception
    {
        List<EnterpriseDTO> list = service.findByNameLike(param).stream()
                .map(c -> mapper.map(c, EnterpriseDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception{
        service.delete(id);
    }*/

}
