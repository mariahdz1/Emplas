package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity /*crea una entidad*/
@Table(name="employee")/*crea la tabla*/
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idEmployee;

    @Column(name="name",length=80,nullable = false)
    private String name;

    @Column(name="email",length=80,nullable = false, unique = true)
    private String email;

    /*@Column(name="profile",nullable = false)
    private Profile profile;*/

    @Column(name="rol",nullable = false)
    private RoleName rol;

    /*@Column(name="transaction",nullable = false)
    private Transaction transaction;*/

    @Column(name="createdAt",nullable = false)//Pendiente consultar fecha automatica
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="updateAt",nullable = false)//Pendiente consultar fecha automatica
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    /* falta definir cardinalidad @ManyToOne  @OneToMany ejemplo:
    @ManyToOne
    @JoinColumn(name = "id_sale", nullable = false, foreignKey = @ForeignKey(name="fk_detail_sale"))
    private Sale sale;*/
}
