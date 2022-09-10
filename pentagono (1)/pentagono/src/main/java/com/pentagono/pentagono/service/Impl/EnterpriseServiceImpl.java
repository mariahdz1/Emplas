package com.pentagono.pentagono.service.Impl;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.repository.IEnterpriseRepository;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl extends CRUDImpl<Enterprise, Long> implements IEnterpriseService {

    @Autowired
    private IEnterpriseRepository repo;

    protected IGenericRepository<Enterprise, Long> getRepo(){ return repo; }

    @Override
    public List<Enterprise> findByName(String name) {
        return repo.findByName(name);
    }

    @Override
    public List<Enterprise> findByNameLike(String name) {
        return repo.findByNameLike("%" + name + "%");
    }
}
