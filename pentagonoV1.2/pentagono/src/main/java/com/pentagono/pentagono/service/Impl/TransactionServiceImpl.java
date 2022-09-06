package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl  {

    @Autowired
    private ITransactionRepository repo;


    /*@Override
    protected IGenericRepository<Transaction, Long> getRepo() {return null;}*/


}
