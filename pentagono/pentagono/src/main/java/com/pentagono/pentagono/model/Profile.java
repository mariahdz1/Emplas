package com.pentagono.pentagono.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="profile")
public class Profile {
    @Id
    private long Idprofile;
    @Column(name = "image")
    private String image;
    @Column(name = "phone",length=30)
    private String phone;
    @Column(name = "user")
    private User user;
    @Column(name = "CreateAt")
    private Date createAt;
    @Column(name = "UpdateAt")
    private Date updateAt;


}
