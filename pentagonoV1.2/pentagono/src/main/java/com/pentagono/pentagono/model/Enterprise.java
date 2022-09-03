package com.pentagono.pentagono.model;/*jessica 1sep*/

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity /*crea una entidad*/
@Table(name="enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //sirve para crear el id secuencia autom*/
    @Column(name = "id", nullable = false, unique = true)
    private long idEnterprise;

    @Column(name = "name",length=80,nullable = false, unique = true)
    private String name;

    @Column(name = "document",length = 50,nullable = false,unique = true)/*NIT*/
    private String document;

    @Column(name = "phone",length = 50)
    private String phone;

    @Column(name = "address",length = 50)
    private String address;

    @OneToMany(mappedBy = "enterprise", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Employee> employees = new ArrayList<>();

    @OneToMany(mappedBy = "enterprise", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Transaction> transactions = new ArrayList<>();

    @Column(name = "createdAt",nullable = false)//Pendiente consultar fecha automatica
    private Date createdAt;

    @Column(name = "updatedAt",nullable = false)//Pendiente consultar fecha automatica
    private Date updatedAt;

    private boolean enabled;

    @Override
    public String toString() {
        return "Enterprise{" +
                "id=" + idEnterprise +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", employees=" + employees +
                ", transactions=" + transactions +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

}
