package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Users;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.repository.IUsersRepository;
import com.pentagono.pentagono.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl extends CRUDImpl<Users, Long> implements IUsersService {
    @Autowired
    private IUsersRepository repo;
    @Override
    protected IGenericRepository<Users, Long> getRepo(){
        return repo;
    }
    @Override
    public List<Users> findByName(String name){
        return repo.findByName(name);
    }
}
