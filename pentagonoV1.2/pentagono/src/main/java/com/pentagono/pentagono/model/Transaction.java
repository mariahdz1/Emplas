package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity /*crea una entidad*/
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)/*generación automática secuencial*/
    @Column(name = "id", nullable = false, unique = true)
    private long idTransaction;

    @Column(name="concept",length=150,nullable = false)
    private String concept;

    @Column(name="amount",columnDefinition = "decimal(5,2)",length=30,nullable = false)
    private float amount;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    /*@Column(name="user",nullable = false)
    private User user;*/

    @Column(name="createdAt",nullable = false)
    private Date createdAt;

    @Column(name="updateAt",nullable = false)
    private Date updatedAt;

    @Column(name="balance",columnDefinition = "decimal(5,2)",length=30)
    private float balance;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + idTransaction +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", employee=" + employee +
                ", enterprise=" + enterprise +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }


}
