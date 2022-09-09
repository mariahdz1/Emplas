package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.model.Users;
import com.pentagono.pentagono.service.IUsersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService service;

    @Autowired
    @Qualifier("usersMapper")
    private ModelMapper mapper;


    @GetMapping("/{id}")
    public Users readById(@PathVariable("id") Long id) throws Exception {
        return service.readById(id);
    }

    @PostMapping
    public Users create(@RequestBody Users users) throws Exception {
        return (Users) service.create(users);
    }

    @PutMapping
    public Users update(@RequestBody Users users) throws Exception {
        return service.update(users);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception{
        service.delete(id);
    }

}
/*@GetMapping
    public ResponseEntity<List<UsersDTO>> readAll() throws Exception {
        List<UsersDTO> list = service.readAll().stream()
                .map(u -> mapper.map(u, UsersDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception {
        Users users = service.readById(id);
        if (users == null) {
            throw new ModelNotFoundException("Id no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }*/
