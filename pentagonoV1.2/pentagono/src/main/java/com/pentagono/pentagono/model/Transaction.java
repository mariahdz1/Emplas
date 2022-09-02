package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.Date;

@Data
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

    /*@Column(name="user",nullable = false)
    private User user;*/

    /*@Column(name="enterprise",nullable = false)
    private Enterprise enterprise;*/

    @Column(name="createdAt",nullable = false)
    private Date createdAt;

    @Column(name="updateAt",nullable = false)
    private Date updatedAt;

    @Column(name="balance",columnDefinition = "decimal(5,2)",length=30)
    private float balance;


}
