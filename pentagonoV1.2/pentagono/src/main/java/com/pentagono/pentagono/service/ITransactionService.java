package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.model.TransactionDetail;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ITransactionService extends ICRUD<Transaction,Long>{
    Transaction saveTransactional (Transaction transaction, List<TransactionDetail> details);

}
