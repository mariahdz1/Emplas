package com.pentagono.pentagono.repository;/*Jessica 1 sept*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenericRepository <T,ID> extends JpaRepository<T,ID> {
}
