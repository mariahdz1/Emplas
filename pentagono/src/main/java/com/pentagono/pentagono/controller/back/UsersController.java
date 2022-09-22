package com.pentagono.pentagono.controller.back;

import com.pentagono.pentagono.dto.UsersDTO;
import com.pentagono.pentagono.exceptions.ModelNotFoundException;
import com.pentagono.pentagono.model.Transaction;
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
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService iUsersService;

    @Autowired
    @Qualifier("usersMapper")
    private ModelMapper mapper;


    @GetMapping
    public List<Users> getUsers(){return iUsersService.getAllUsers();}

    @PostMapping
    public Users createUsers(@RequestBody Users users){return iUsersService.createUsers(users);}

   /* @GetMapping
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
            throw new ModelNotFoundException("El Id Número: " + id + " No se encuentra");
        }
        UsersDTO dto = mapper.map(use, UsersDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    /*@GetMapping("/find/name/{name}")
    public ResponseEntity<List<UsersDTO>> findByName(@PathVariable("name") String name) throws Exception{
        List<UsersDTO> list = service.findByName(name).stream()
                .map(c -> mapper.map(c, UsersDTO.class))
                .collect(Collectors.toList());
        if(list == null){
            throw new ModelNotFoundException("El Nombre: " + name + " No se encuentra");
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }*/

    @PutMapping("/{id}")
    public ResponseEntity<UsersDTO> update(@Valid @RequestBody UsersDTO userDTO) throws Exception{
        Users use = iUsersService.readById(userDTO.getIdUser());
        if(use == null){
            throw new ModelNotFoundException("El Id no se encuentra: " + userDTO.getIdUser());
        }
        Users user = iUsersService.update(mapper.map(userDTO, Users.class));
        UsersDTO dto = mapper.map(user, UsersDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UsersDTO> updatePatch(@Valid @RequestBody UsersDTO userDTO) throws Exception{
        Users use = iUsersService.readById(userDTO.getIdUser());
        if(use == null){
            throw new ModelNotFoundException("El Id no se encuentra: " + userDTO.getIdUser());
        }
        Users user = iUsersService.update(mapper.map(userDTO, Users.class));
        UsersDTO dto = mapper.map(user, UsersDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception{
        Users user = iUsersService.readById(id);
        if(user == null){
            throw new ModelNotFoundException("El Id Número: " + id + " No se encuentra");
        }
        iUsersService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}

