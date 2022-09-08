package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Enterprise;

import java.util.List;

public interface IEnterpriseService {
    Enterprise create (Enterprise enterprise) throws Exception;
    Enterprise update(Enterprise enterprise)throws Exception;
    List<Enterprise> readAll()throws Exception;
    Enterprise readById(Long id)throws Exception;
    void delete (Long id) throws Exception;

}
