package com.pentagono.pentagono2.repository;

import com.pentagono.pentagono2.model.Enterprise;
import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;

import java.util.List;

public interface IEnterpriseRepository extends IGenericRepository<Enterprise,Long> {
    List<Enterprise> findByName(String name);
    List<Enterprise> findByNameLike(String name);
}
