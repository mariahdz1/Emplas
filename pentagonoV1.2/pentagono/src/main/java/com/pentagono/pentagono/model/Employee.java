package com.pentagono.pentagono.model;/*jessica 1sep*/

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pentagono.pentagono.dto.RoleName;
import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data/*ahorra código getter y setter y constructor*/
@Entity /*crea una entidad*/
@Table(name="employee")/*crea la tabla*/
public class Employee {

    @Id/*clave principal*/
    @GeneratedValue(strategy=GenerationType.AUTO)/*genera automáticamente el id secuencial*/
    private Long idEmployee;

    @Column(name="name",length=80,nullable = false)
    private String name;

    @Column(name="email",length=80,nullable = false, unique = true)
    private String email;

    @OneToMany //FK
    @JoinColumn(name="profile_id")
    private Profile profile;

    @OneToMany
    @Column(name = "role")
    private RolName role;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Transaction> transactions = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    @Column(name="rol",nullable = false)
    private RoleName roleName;

    @Column(name="createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="updateAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + idEmployee +
                ", email='" + email + '\'' +
                ", profile=" + profile +
                ", role=" + role +
                ", enterprise=" + enterprise +
                ", transactions=" + transactions +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updateAt +
                '}';
    }
}
