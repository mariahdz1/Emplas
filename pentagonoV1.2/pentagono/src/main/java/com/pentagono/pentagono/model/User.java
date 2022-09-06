package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idUser;

    @OneToOne
    @JoinColumn(name = "id_employee", nullable = false)
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
