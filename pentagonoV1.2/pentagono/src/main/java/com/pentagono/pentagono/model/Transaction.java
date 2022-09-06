package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity /*crea una entidad*/
/*@Table(name="transaction")*/
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*@Column(name = "id", nullable = false, unique = true)*/
    private long idTransaction;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false)
    private Employee employee;

    @Column(name="concept",length=150,nullable = false)
    private String concept;

    @Column(name="amount",columnDefinition = "decimal(5,2)",length=30,nullable = false)
    private float amount;

    @Column(name="createdAt",nullable = false)
    private Date createdAt;

    @Column(name="updateAt",nullable = false)
    private Date updatedAt;

    @Column(name="balance",columnDefinition = "decimal(5,2)",length=30)
    private float balance;

}
