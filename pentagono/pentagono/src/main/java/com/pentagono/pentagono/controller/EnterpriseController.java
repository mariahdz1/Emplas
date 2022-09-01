package com.pentagono.pentagono.controller;/*jessica 1sep*/

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

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
    @Autowired/*inicializa variable*/
    private IEnterpriseService service;

    @Autowired
    @Qualifier("enterpriseMapper")
    private ModelMapper mapper;

    @GetMapping /*este es el GET*/
    public ResposeEntity<List<EnterpriseDTO>>readAll() throws Exception{
        List<EnterpriseDTO>list  =service.readAll().stream()
                .map(c -> mapper.map(c,EnterpriseDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity  <EnterpriseDTO> create(@Valid @RequestBody EnterpriseDTO enterpriseDto) throws Exception{
         Enterprise ent =service.create(mapper.map(enterpriseDto, Enterprise.class));
         EnterpriseDTO dto =mapper.map(ent,EnterpriseDTO.class);
         return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnterpriseDTO> readById(@PathVariable("id") Long id) throws Exception{
        Enterprise ent = service.readById(id);
        if(ent == null){
            throw new ModelNotFoundException("Id de la Empresa no encontrado: " + id);
        }
        EnterpriseDTO dto = mapper.map(ent, EnterpriseDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<EnterpriseDTO> update(@Valid @RequestBody EnterpriseDTO enterpriseDto) throws Exception{
        Enterprise ent = service.readById(enterpriseDto.getIdEnterprise());
        if(ent == null){
            throw new ModelNotFoundException("Id de la Empresa no encontrado: " + enterpriseDto.getIdEnterprise());
        }
        Enterprise enterprise = service.update(mapper.map(enterpriseDto, Enterprise.class));
        EnterpriseDTO dto = mapper.map(enterprise, EnterpriseDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception{
        Enterprise ent = service.readById(id);
        if(ent == null){
            throw new ModelNotFoundException("Id de la Empresa no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
