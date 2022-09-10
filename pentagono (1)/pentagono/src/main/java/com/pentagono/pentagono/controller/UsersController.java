package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.dto.EnterpriseDTO;
import com.pentagono.pentagono.dto.UsersDTO;
import com.pentagono.pentagono.exceptions.ModelNotFoundException;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Users;
import com.pentagono.pentagono.service.IUsersService;
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
@RequestMapping("users")
public class UsersController {
    @Autowired
    private IUsersService service;

    @Autowired
    @Qualifier("usersMapper")
    private ModelMapper mapper;


    @GetMapping
    public ResponseEntity<List<UsersDTO>> readAll() throws Exception{
        List<UsersDTO> list = service.readAll().stream()
                .map(u -> mapper.map(u, UsersDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UsersDTO> create(@Valid @RequestBody UsersDTO userDTO) throws Exception{
        Users use = service.create(mapper.map(userDTO, Users.class));
        UsersDTO dto = mapper.map(use,UsersDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsersDTO> readById(@PathVariable("id") Long id) throws Exception{
        Users use = service.readById(id);
        if(use == null){
            throw new ModelNotFoundException("Id Nº: " + id + " No fue encontrado");
        }
        UsersDTO dto = mapper.map(use, UsersDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<UsersDTO> update(@Valid @RequestBody UsersDTO userDTO) throws Exception{
        Users use = service.readById(userDTO.getIdUser());
        if(use == null){
            throw new ModelNotFoundException("Id no encontrado: " + userDTO.getIdUser());
        }
        Users user = service.update(mapper.map(userDTO, Users.class));
        UsersDTO dto = mapper.map(user, UsersDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UsersDTO> updatePatch(@Valid @RequestBody UsersDTO usersDto) throws Exception{
        Users us = service.readById(usersDto.getIdUser());
        if(us == null){
            throw new ModelNotFoundException("Id del Empleado no encontrado: " + usersDto.getIdUser());
        }
        Users users = service.update(mapper.map(usersDto, Users.class));
        UsersDTO dto = mapper.map(users, UsersDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception{
        Users user = service.readById(id);
        if(user == null){
            throw new ModelNotFoundException("Id no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}

