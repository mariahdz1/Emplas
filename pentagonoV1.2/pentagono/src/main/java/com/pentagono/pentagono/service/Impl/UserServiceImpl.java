package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.User;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.repository.IUserRepository;
import com.pentagono.pentagono.service.ICRUD;
import com.pentagono.pentagono.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl extends CRUDImpl<User, Long> implements IUserService {


    @Autowired
    private IUserRepository repo;
    @Override
    protected IGenericRepository<User, Long> getRepo() {return null;}/*repo*/
}
