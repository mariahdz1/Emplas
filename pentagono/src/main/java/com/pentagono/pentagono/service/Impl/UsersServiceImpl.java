package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Transaction;
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
    public List<Users> getAllUsers() {
        return null;
    }

    @Override
    public void saveUsers(Users User) {

    }

    @Override
    public Users getUsersById(long idUser) {
        return null;
    }

    @Override
    public void deleteUsersById(Long idUser) {

    }

    @Override
    public Users createUsers(Users users) {
        return null;
    }



   /* public List<Users> getAllUsers() {return (List<Users>) this.iUsersRepository.findAll();}

    public Transaction createTransaction(Transaction transaction) {
        return this.iUsersRepository.save(transaction);
    }*/

}
