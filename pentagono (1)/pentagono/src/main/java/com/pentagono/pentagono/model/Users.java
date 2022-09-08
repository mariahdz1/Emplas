package com.pentagono.pentagono.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUser", nullable = false)
    private Long idUser;

    @ManyToOne
    @JoinColumn(name = "user_enterprise", referencedColumnName = "idEnterprise")
    private Enterprise enterprise;

    @Column(name="password",length=8, nullable = false)
    private Long password;

    @Column(name="role",nullable=false)
    private RoleName rolename;
}
