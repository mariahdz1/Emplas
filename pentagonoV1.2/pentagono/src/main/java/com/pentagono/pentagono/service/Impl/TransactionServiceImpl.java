package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.repository.ITransactionRepository;
import com.pentagono.pentagono.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl extends CRUDImpl<Transaction, Long> implements ITransactionService {

    @Autowired
    private ITransactionRepository repo;


    @Override
    protected IGenericRepository<Transaction, Long> getRepo() {return this.repo;}
    public List<Transaction> findByName(String name){
        return null;
    }


}
