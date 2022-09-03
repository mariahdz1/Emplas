package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private long idProfile;

    @Column(name = "image", length=100)
    private String image;

    @Column(name = "phone",length=30)
    private String phone;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "CreateAt")
    private Date createAt;

    @Column(name = "UpdateAt")
    private Date updateAt;



    @Override
    public String toString() {
        return "Profile{" +
                "id='" + idProfile + '\'' +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", employee=" + employee +
                ", createdAt=" + createAt +
                ", updatedAt=" + updateAt +
                '}';
    }

}
