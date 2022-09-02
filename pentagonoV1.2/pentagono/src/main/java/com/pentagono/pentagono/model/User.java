package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="userData")
public class User {
    @Id
    private long idUser;
    @Column(name="email",length=30,nullable = false, unique = true)
    private String email;
    @Column(name="password",length=8,nullable = false)
    private String password;
/* falta definir cardinalidad @ManyToOne  @OneToMany*/
}
