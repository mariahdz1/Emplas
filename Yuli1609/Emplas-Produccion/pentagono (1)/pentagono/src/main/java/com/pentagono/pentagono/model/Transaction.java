package com.pentagono.pentagono.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private long idTransaction;

    @OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL)
    private List<TransactionDetail> details;

    @ManyToOne
    @JoinColumn(name = "employee_transaction", nullable = false, referencedColumnName = "idEmployee")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "enterpriseMovements", nullable = false, referencedColumnName = "idEnterprise")
    private Enterprise enterprise;

    @Column(name="createdAt",nullable = false)
    private Date createdAt;

    @Column(name="updateAt",nullable = false)
    private Date updatedAt;

    @Column(name="balance",/*columnDefinition = "decimal(5,2)",*/length=50)
    private long balance;

    @Column(nullable = false)
    private boolean enabled;
}
