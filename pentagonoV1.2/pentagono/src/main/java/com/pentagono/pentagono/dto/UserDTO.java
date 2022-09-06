package com.pentagono.pentagono.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pentagono.pentagono.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long idUser;

    private Employee employee;

    private String user;

    private String password;

    private Date createdAt;

    private Date updateAt;

    private boolean enabled;

}
