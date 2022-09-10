package com.pentagono.pentagono.dto;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.RoleName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long IdEmployee;
    private Enterprise enterprise;
    private String identification;
    private String email;
    private String phone;
    private String image;
    private Date createdAt;
    private Date updateAt;
    private boolean enabled;


}

    /*private RoleName rolename;

    private Long password;
    */