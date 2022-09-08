package com.pentagono.pentagono.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEmployee;

    @ManyToOne
    @JoinColumn(name = "employee_enterprise", referencedColumnName = "idEnterprise")
    private Enterprise enterprise;

    @Column(name="identification",length=80,nullable = false)
    private String identification;

    @Column(name="email",length=80,nullable = false, unique = true)
    private String email;

    @Column(name = "phone",length=30)
    private String phone;

    @Column(name="name",length=80,nullable = false)
    private String name;

    @Column(name = "image", length=200)
    private String image;

    @Column(name="createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="updateAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    @Column(name="role",nullable=false)
    @Enumerated(value=EnumType.STRING)
    private RoleName rolename;
}
