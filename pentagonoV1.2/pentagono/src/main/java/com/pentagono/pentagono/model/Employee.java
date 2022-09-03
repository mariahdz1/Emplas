package com.pentagono.pentagono.model;/*jessica 1sep*/

import javax.persistence.*;
import java.util.Date;

@Entity /*crea una entidad*/
@Table(name="employee")/*crea la tabla*/
public class Employee {

    public Employee() {
    }

    public Employee(Long idEmployee, String name, String email, Date createdAt, Date updateAt, ERoleName rolename, Transaction transaction) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.rolename = rolename;

    }

    @Id/*clave principal*/
    @GeneratedValue(strategy=GenerationType.AUTO)/*genera automáticamente el id secuencial*/
    private Long idEmployee;

    @Column(name="name",length=80,nullable = false)
    private String name;

    @Column(name="email",length=80,nullable = false, unique = true)
    private String email;

    @Column(name="createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="updateAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    @ManyToOne //FK
    @JoinColumn(name="profile_id")
    private Profile profile;

    @Column(name="role",nullable=false)
    @Enumerated(value=EnumType.STRING)
    private ERoleName rolename;

    @ManyToOne//fk
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;


}
