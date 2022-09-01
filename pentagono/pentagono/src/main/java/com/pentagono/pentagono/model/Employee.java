package com.pentagono.pentagono.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity /*crea una entidad*/
@Table(name="employee")/*crea la tabla*/
public class Employee {
    @Id
    private long idEmployee;
    @Column(name="name",length=80,nullable = false)
    private String name;
    @Column(name="email",length=80,nullable = false, unique = true)
    private String email;
    @Column(name="profile",nullable = false)
    private Profile profile;
    @Column(name="rol",nullable = false)
    private Enum_RoleName rol;
    @Column(name="transaction",nullable = false)
    private Transaction transaction;
    @Column(name="createdAt",nullable = false)//Pendiente consultar fecha automatica
    private Date createdAt;
    @Column(name="updateAt",nullable = false)//Pendiente consultar fecha automatica
    private Date updateAt;

}
