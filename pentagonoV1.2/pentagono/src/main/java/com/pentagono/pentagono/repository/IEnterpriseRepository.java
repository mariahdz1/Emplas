package com.pentagono.pentagono.repository;/*Jessica 1 sept*/

import com.pentagono.pentagono.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEnterpriseRepository extends IGenericRepository<Enterprise,Long> {

    List<Enterprise> findByName(String name);
    List<Enterprise> findByNameLike(String name);
}
