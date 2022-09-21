package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.model.TransactionDetail;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.repository.ITransactionRepository;
import com.pentagono.pentagono.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TransactionServiceImpl extends CRUDImpl <Transaction, Long> implements ITransactionService {
    @Autowired
    private ITransactionRepository repo;

    @Override
    protected IGenericRepository<Transaction, Long> getRepo() {
        return repo;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return null;
    }

    @Override
    public void saveTransaction(Transaction transaction) {

    }

    @Override
    public Enterprise getTransactionById(long id) {
        return null;
    }

    @Override
    public void deleteTransactionById(Long id) {

    }
}
