package com.pentagono.pentagono2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class Enterprise {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private long idEnterprise;

    /*@OneToMany
    @JoinColumn(name = "id_transaction")
    private Transaction transaction;*/

    @Column(name = "name",length=50,nullable = false, unique = true)
    private String name;

    @Column(name = "NIT",length = 50,nullable = false,unique = true)/*NIT*/
    private String nit;

    @Column(name = "phone",length = 30)
    private String phone;

    @Column(name = "address",length = 50)
    private String address;

    @Column(name = "createdAt",nullable = false)//Pendiente consultar fecha automatica
    private Date createdAt;

    @Column(name = "updatedAt",nullable = false)//Pendiente consultar fecha automatica
    private Date updatedAt;

    private boolean enabled;


}
