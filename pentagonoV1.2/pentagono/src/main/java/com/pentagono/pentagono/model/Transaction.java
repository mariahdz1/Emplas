package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity /*crea una entidad*/
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private long idTransaction;

    @ManyToOne
    @JoinColumn(name = "transaction_employee", nullable = false, referencedColumnName = "idEmployee")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "transaction_user", nullable = false, referencedColumnName = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "transaction_enterprise", nullable = false, referencedColumnName = "idEnterprise")
    private Enterprise enterprise;

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
