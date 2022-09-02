package com.pentagono.pentagono.model;/*jessica 1sep*/

/*import lombok.Data;*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity /*crea una entidad*/
@Table(name="enterprise")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //sirve para crear el id secuencia autom*/
    private long idEnterprise;
    @Column(name = "name",length=80,nullable = false, unique = true)
    private String name;
    @Column(name = "document",length = 50,nullable = false,unique = true)/*NIT*/
    private String document;
    @Column(name = "phone",length = 50)
    private String phone;
    @Column(name = "address",length = 50)
    private String address;
    @Column(name = "users",nullable = false)
    private User users;
    @Column(name = "transactions",nullable = false)
    private Transaction transactions;
    @Column(name = "createdAt",nullable = false)//Pendiente consultar fecha automatica
    private Date createdAt;
    @Column(name = "updatedAt",nullable = false)//Pendiente consultar fecha automatica
    private Date updatedAt;
    private boolean enabled;
    /* falta definir cardinalidad @ManyToOne  @OneToMany*/

    public void setIdEnterprise(long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public void setTransactions(Transaction transactions) {
        this.transactions = transactions;
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
