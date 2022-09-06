package com.pentagono.pentagono.model;/*jessica 1sep*/

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity /*crea una entidad*/
@Table(name="enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //sirve para crear el id secuencia autom*/
    @Column(name = "id", nullable = false, unique = true)
    private long idEnterprise;

    @OneToMany
    @JoinColumn(name = "id_transaction")
    private Transaction transaction;

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

    public void setIdEnterprise(long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}


