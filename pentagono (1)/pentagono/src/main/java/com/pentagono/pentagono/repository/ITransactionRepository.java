package com.pentagono.pentagono.repository;

import com.pentagono.pentagono.model.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransactionRepository extends IGenericRepository<Transaction,Long>{


}
