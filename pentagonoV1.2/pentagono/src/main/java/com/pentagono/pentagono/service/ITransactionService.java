package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;

import java.util.List;

public interface ITransactionService extends ICRUD<Transaction,Long>{

    List<Transaction> findByName(String name);
}
