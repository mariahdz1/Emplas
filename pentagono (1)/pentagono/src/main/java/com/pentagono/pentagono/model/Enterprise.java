package com.pentagono.pentagono.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.Date;

@Data
@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEnterprise;

    @Column(name = "name",length=50,nullable = false, unique = true)
    private String name;

    @Column(name = "NIT",length = 50,nullable = false,unique = true)/*NIT*/
    private String nit;

    @Column(name = "phone",length = 30)
    private String phone;

    @Column(name = "address",length = 50)
    private String address;

    @Column(name = "createdAt",nullable = false)
    private Date createdAt;

    @Column(name = "updatedAt",nullable = false)
    private Date updatedAt;

    private boolean enabled;
}
