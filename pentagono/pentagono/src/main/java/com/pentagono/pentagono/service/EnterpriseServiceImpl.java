package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.repository.IEnterpriseRepository;
import com.pentagono.pentagono.service.Impl.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*aca ponemos acciones a la interfaz*/
@Service
public class EnterpriseServiceImpl implements IEnterpriseService {

    @Autowired/*esto nos ahorra crear muchas instancias*/
    private IEnterpriseRepository repo;


    /*métodos que se implementaron automáticamente al crear @service por si falla*/
    @Override
    public Enterprise create(Enterprise enterprise) throws Exception {
        return repo.save(enterprise);
    }

    @Override
    public Enterprise update(Enterprise enterprise) throws Exception {
        return repo.save(enterprise);
    }

    @Override
    public List<Enterprise> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Enterprise readById(Integer id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }






}
