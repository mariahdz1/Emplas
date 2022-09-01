package com.pentagono.pentagono.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity /*crea una entidad*/
@Table(name="transaction")
public class Transaction {
    @Id
    private long idTransaction;
    @Column(name="concept",length=150,nullable = false)
    private String concept;
    @Column(name="amount",length=30,nullable = false)
    private float amount;
    @Column(name="user",nullable = false)
    private User user;
    @Column(name="enterprise",nullable = false)
    private Enterprise enterprise;
    @Column(name="createdAt",nullable = false)//Pendiente consultar fecha automatica
    private Date createdAt;
    @Column(name="updateAt",nullable = false)//Pendiente consultar fecha automatica
    private Date updatedAt;
    @Column(name="balance",length=30)
    private float balance;

}
