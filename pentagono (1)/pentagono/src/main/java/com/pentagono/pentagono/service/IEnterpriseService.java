package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.model.TransactionDetail;

import java.util.List;

public interface IEnterpriseService extends ICRUD<Enterprise, Long> {
    List<Enterprise> findByName(String name);
    List<Enterprise> findByNameLike(String name);

}
