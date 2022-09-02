package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Idprofile;

    @Column(name = "image", length=100)
    private String image;

    @Column(name = "phone",length=30)
    private String phone;

    /*@Column(name = "user")
    private User user;*/

    @Column(name = "CreateAt")
    private Date createAt;

    @Column(name = "UpdateAt")
    private Date updateAt;



}
