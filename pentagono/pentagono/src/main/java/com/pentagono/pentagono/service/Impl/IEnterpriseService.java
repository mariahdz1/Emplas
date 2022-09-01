package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Enterprise;


import java.util.List;

public interface IEnterpriseService {
    /*throws Exception captura cuando se genera un error en el método*/
    Enterprise create (Enterprise enterprise) throws Exception;
    Enterprise update(Enterprise enterprise) throws Exception;
    List<Enterprise> readAll() throws Exception;
    Enterprise readById(Integer id) throws Exception;
    void delete (Integer id) throws Exception;

}
