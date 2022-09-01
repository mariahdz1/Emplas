package com.pentagono.pentagono.service.Impl;/*jessica 1sep*/

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.repository.IEnterpriseRepository;
import com.pentagono.pentagono.repository.IGenericRepository;
import com.pentagono.pentagono.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*aca ponemos acciones a la interfaz*/
@Service
public class EnterpriseServiceImpl extends CRUDImpl<Enterprise, Long> implements IEnterpriseService {

    @Autowired/*esto nos ahorra crear muchas instancias*/
    private IEnterpriseRepository repo;

    protected IGenericRepository<Enterprise, Long> getRepo(){
        return repo;
    }

    @Override
    public List<Enterprise> findByName(String name) {
        return repo.findByName(name);
    }
}
