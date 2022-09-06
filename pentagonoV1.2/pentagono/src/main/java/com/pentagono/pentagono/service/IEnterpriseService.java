package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Enterprise;


import java.util.List;

public interface IEnterpriseService extends ICRUD<Enterprise,Long> {

    List<Enterprise> findByName(String name);

}
