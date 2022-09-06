package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.repository.ITransactionRepository;
import com.pentagono.pentagono.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class TransactionServiceImpl extends CRUDImpl<Transaction, Long> implements ITransactionService {

@Autowired
private ITransactionRepository repo;

    @Override
    public List<Transaction> findByName(String name) {
        return null;
    }

    @Override
    protected IGenericRepository<Transaction, Long> getRepo() {
        return null;
    }
}
