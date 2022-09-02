package com.pentagono.pentagono.model;/*jessica 1sep*/

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data/*ahorra código getter y setter y constructor*/
@Entity /*crea una entidad*/
@Table(name="employee")/*crea la tabla*/
public class Employee {

    @Id/*clave principal*/
    @GeneratedValue(strategy=GenerationType.IDENTITY)/*genera automáticamente el id secuencial*/
    private Long idEmployee;

    @Column(name="name",length=80,nullable = false)
    private String name;

    @Column(name="email",length=80,nullable = false, unique = true)
    private String email;

    /*@ManyToOne //FK ojo aca hubo cambios 2 sept 2022
    @JoinTable(name = "employeeProfile",
            joinColumns = @JoinColumn(name="id_employee"),
            inverseJoinColumns=@JoinColumn(name="id_profile"))
    private Profile profile;*/

    @Column(name="rol",nullable = false)
    private RoleName rol;

    /*@OneToMany //FK ojo aca hubo cambios 2 sept 2022
    @JoinTable(name = "employeeTransaction",
        joinColumns = @JoinColumn(name="id_employee"),
        inverseJoinColumns=@JoinColumn(name="id_transaction"))
    private Transaction transaction;*/

    @Column(name="createdAt",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="updateAt",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;


}
