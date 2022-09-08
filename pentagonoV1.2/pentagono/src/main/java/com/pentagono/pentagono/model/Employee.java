package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idEmployee;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "employee_enterprise", referencedColumnName = "idEnterprise")
    private Enterprise enterprise;

    @OneToMany(mappedBy="employee")
    private Set<Transaction> transaction;

    @Column(name="identification",length=80,nullable = false)
    private String identification;

    @Column(name="email",length=80,nullable = false, unique = true)
    private String email;

    @Column(name = "phone",length=30)
    private String phone;

    @Column(name="name",length=80,nullable = false)
    private String name;

    @Column(name = "image", length=100)
    private String image;

    @Column(name="createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="updateAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    @Column(name="role",nullable=false)
    @Enumerated(value=EnumType.STRING)
    private ERoleName rolename;


}
