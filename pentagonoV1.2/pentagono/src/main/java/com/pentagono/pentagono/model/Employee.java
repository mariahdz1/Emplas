package com.pentagono.pentagono.model;/*jessica 1sep*/

import javax.persistence.*;
import java.util.Date;

@Entity /*crea una entidad*/
@Table(name="employee")/*crea la tabla*/
public class Employee {

    @Id/*clave principal*/
    @GeneratedValue(strategy=GenerationType.AUTO)/*genera automáticamente el id secuencial*/
    private Long idEmployee;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_enterprise")
    private Enterprise enterprise;

    @ManyToOne
    @JoinColumn(name = "id_transaction")
    private Transaction transaction;

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
