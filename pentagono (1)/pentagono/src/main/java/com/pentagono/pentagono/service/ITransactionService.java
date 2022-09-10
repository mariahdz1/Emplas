package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.model.TransactionDetail;
import java.util.List;

/*@Component*/
public interface ITransactionService extends ICRUD<Transaction,Long>{

    /*List<Transaction> findByName(String name);
    List<Transaction> findByNameLike(String name);*/
    Transaction saveTransactional (Transaction transaction, List<TransactionDetail> details);
}
