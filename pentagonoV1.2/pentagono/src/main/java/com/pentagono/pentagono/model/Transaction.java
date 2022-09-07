package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity /*crea una entidad*/
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private long idTransaction;

    @OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL)
    private List<TransactionDetail> details;

    @Column(name="createdAt",nullable = false)
    private Date createdAt;

    @Column(name="updateAt",nullable = false)
    private Date updatedAt;

    @Column(name="balance",columnDefinition = "decimal(5,2)",length=30)
    private float balance;

    @Column(nullable = false)
    private boolean enabled;

}
