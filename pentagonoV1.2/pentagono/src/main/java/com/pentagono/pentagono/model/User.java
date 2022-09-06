package com.pentagono.pentagono.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idUser;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "user_employee", nullable = false, referencedColumnName = "idEmployee")
    private Employee employee;

    @Column(name="user",length=30)
    private String user;

    @Column(name="password",length=8,nullable = false, unique = true)
    private String password;

    @Column(name="createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="updateAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    private boolean enabled;

}
