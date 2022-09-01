package com.pentagono.pentagono.model;/*jessica 1sep*/

import javax.persistence.*;
import java.util.Date;

@Entity /*crea una entidad*/
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*generación automática secuencial*/
    private long idTransaction;
    @Column(name="concept",length=150,nullable = false)
    private String concept;
    @Column(name="amount",columnDefinition = "decimal(5,2)",length=30,nullable = false)
    private float amount;
    @Column(name="user",nullable = false)
    private User user;
    @Column(name="enterprise",nullable = false)
    private Enterprise enterprise;
    @Column(name="createdAt",nullable = false)//Pendiente consultar fecha automatica - createdAt= new Date();
    private Date createdAt;
    @Column(name="updateAt",nullable = false)//Pendiente consultar fecha automatica
    private Date updatedAt;
    @Column(name="balance",columnDefinition = "decimal(5,2)",length=30)/*le puse el columnDef*/
    private float balance;
    /* falta definir cardinalidad @ManyToOne  @OneToMany*/
}
