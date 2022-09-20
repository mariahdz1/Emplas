package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.model.TransactionDetail;
import java.util.List;


public interface ITransactionService extends ICRUD<Transaction,Long>{

    Transaction saveTransactional (Transaction transaction, List<TransactionDetail> details);
}
