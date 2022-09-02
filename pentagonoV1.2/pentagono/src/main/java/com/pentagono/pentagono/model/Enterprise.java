package com.pentagono.pentagono.model;/*jessica 1sep*/

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
    /*@Column(name = "users",nullable = false)
    private User users;
    @Column(name = "transactions",nullable = false)
    private Transaction transactions;*/
    @Column(name = "createdAt",nullable = false)//Pendiente consultar fecha automatica
    private Date createdAt;
    @Column(name = "updatedAt",nullable = false)//Pendiente consultar fecha automatica
    private Date updatedAt;
    private boolean enabled;
    /* falta definir cardinalidad @ManyToOne  @OneToMany*/
}
