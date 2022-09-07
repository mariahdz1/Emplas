package com.pentagono.pentagono.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
/*@Table(name="user")*/
public class User {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idUser;

    @Column(name="user",length=30)
    private String user;

    @Column(name="password",length=8,unique = true)
    private String password;

    @Column(name="createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="updateAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    private boolean enabled;

}
