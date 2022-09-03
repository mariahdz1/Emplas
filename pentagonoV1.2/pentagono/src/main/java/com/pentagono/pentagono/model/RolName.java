package com.pentagono.pentagono.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class RolName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 150, nullable = false)
    private String address;

    @OneToOne
    @JoinColumn(name = "employee_id_rol")
    private Employee employee;

    private boolean enabled;

}
